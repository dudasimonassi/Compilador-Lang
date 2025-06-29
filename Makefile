# Caminhos
ANTLR_JAR=lib/antlr-4.13.2-complete.jar
SRC_DIR=src
GEN_DIR=$(SRC_DIR)\generated
GRAMMAR=antlr\Lang.g4
MAIN_CLASS=meupacote.Main
INPUT=input\teste.lang

# Variáveis Java
JAVAC=javac
JAVA=java

# Alvo padrão: gera, compila e executa
all: run

# Gera o parser e lexer do ANTLR
generate:
	if not exist $(GEN_DIR) mkdir $(GEN_DIR)
	$(JAVA) -jar $(ANTLR_JAR) -o $(GEN_DIR) -package meupacote.parser $(GRAMMAR)

# Compila o código Java
compile: generate
	$(JAVAC) -cp "$(ANTLR_JAR);$(GEN_DIR)" $(SRC_DIR)\meupacote\Main.java $(GEN_DIR)\*.java -d build

# Executa o analisador
run: compile
	$(JAVA) -cp "build;$(ANTLR_JAR)" $(MAIN_CLASS) $(INPUT)

# Limpa arquivos gerados
clean:
	if exist build rmdir /s /q build
	if exist $(GEN_DIR) rmdir /s /q $(GEN_DIR)
