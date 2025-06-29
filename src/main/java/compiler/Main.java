package compiler;

import org.antlr.v4.runtime.*;
import compiler.antlr.LangLexer;
import compiler.antlr.LangParser;
import compiler.interpreter.LangInterpreter; // Importe seu interpretador

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
            case "-i":
                processInterpret(fileName);
                break;
            default:
                System.out.println("Diretiva não reconhecida: " + directive);
                System.exit(1);
        }
    }

    private static void processSyntax(String fileName) {
        if (parseAndValidate(fileName)) {
            System.out.println("accept");
        } else {
            System.out.println("reject");
        }
    }

    private static void processInterpret(String fileName) {
        if (parseAndValidate(fileName)) {
            // Só chama o interpretador se a análise sintática for válida
            try (InputStream is = new FileInputStream(fileName)) {
                CharStream input = CharStreams.fromStream(is);
                LangLexer lexer = new LangLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                LangParser parser = new LangParser(tokens);

                // Aqui você pode usar o visitor do interpretador
                LangInterpreter interpreter = new LangInterpreter();
                interpreter.visit(parser.prog());
            } catch (Exception e) {
                System.out.println("Erro ao interpretar: " + e.getMessage());
            }
        } else {
            System.out.println("reject");
        }
    }

    // Faz o parsing e retorna true se aceito, false se rejeitado
    private static boolean parseAndValidate(String fileName) {
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

            return !errorListener.hasError();
        } catch (Exception e) {
            return false;
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
