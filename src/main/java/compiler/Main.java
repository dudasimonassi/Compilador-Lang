package compiler;

import org.antlr.v4.runtime.*;
import compiler.antlr.LangLexer;
import compiler.antlr.LangParser;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java -cp \"build;lib/antlr-4.13.2-complete.jar\" compiler.Main <diretiva> <arquivo.lang>");
            System.exit(1);
        }
        String directive = args[0];
        String fileName = args[1];

        switch (directive) {
            case "-syn":
                processSyntax(fileName);
                break;
            case "i":
                System.out.println("interpretador");
                break;
            default:
                System.out.println("Diretiva não reconhecida: " + directive);
                System.exit(1);
        }
    }

    private static void processSyntax(String fileName) {
        try (InputStream is = new FileInputStream(fileName)) {
            CharStream input = CharStreams.fromStream(is);
            LangLexer lexer = new LangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LangParser parser = new LangParser(tokens);

            parser.removeErrorListeners();
            lexer.removeErrorListeners();

            SyntaxErrorListener errorListener = new SyntaxErrorListener();
            parser.addErrorListener(errorListener);
            lexer.addErrorListener(errorListener);

            parser.prog();

            if (errorListener.hasError()) {
                System.out.println("reject");
            } else {
                System.out.println("accept");
            }
        } catch (Exception e) {
            System.out.println("reject");
        }
    }

    // Listener para capturar erros léxicos e sintáticos
    static class SyntaxErrorListener extends BaseErrorListener {
        private boolean error = false;
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                int line, int charPositionInLine, String msg, RecognitionException e) {
            error = true;
        }
        public boolean hasError() {
            return error;
        }
    }
}
