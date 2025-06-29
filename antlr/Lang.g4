grammar Lang;

@header {
    package compiler.antlr;
}

// --------------------------------------------------- //
// Parser rules

prog : def* ;

def : data
    | fun ;

data : ABSTRACT DATA TYID LBRACE (decl | fun)* RBRACE
     | DATA TYID LBRACE (decl)* RBRACE  ;

decl : ID DCOLON type SEMI ;

fun : ID LPAREN params? RPAREN (COLON type (COMMA type)*)? cmd  ;

params : ID DCOLON type (COMMA ID DCOLON type)*  ;

type : type LBRACK RBRACK 
     | btype ;

btype : INT_TYPE
      | CHAR_TYPE
      | BOOL_TYPE
      | FLOAT_TYPE
      | TYID  ;

block : LBRACE (cmd)* RBRACE  ;

cmd : block 
    | IF LPAREN exp RPAREN cmd 
    | IF LPAREN exp RPAREN cmd ELSE cmd
    | ITERATE LPAREN itcond RPAREN cmd
    | READ lvalue SEMI
    | PRINT exp SEMI
    | RETURN exp (SEMI exp)* SEMI
    | lvalue ASSIGN exp SEMI
    | ID LPAREN exps? RPAREN (LE_OP lvalue (COMMA lvalue )* RANGLE)? SEMI  ;

itcond : ID COLON exp
       | exp  ;

exp : LPAREN exp RPAREN
    | ID LPAREN exps? RPAREN (LBRACK exp RBRACK)?
    | NEW type (LBRACK exp RBRACK)?
    | '!' exp
    | '-' exp
    | lvalue
    | exp op exp
    | TRUE
    | FALSE
    | NULL
    | INT 
    | FLOAT 
    | CHAR  ;

op : AND_OP
   | LE_OP
   | EQ_OP
   | NEQ_OP
   | PLUS_OP
   | MINUS_OP
   | MULT_OP
   | DIV_OP
   | MOD_OP  ;

lvalue : ID 
       | lvalue LBRACK exp RBRACK 
       | lvalue DOT ID  ;

exps :  exp (COMMA exp )*  ;

// --------------------------------------------------- //


// --------------------------------------------------- //
// Lexer rules 

WS : [ \t\r\n]+ -> skip ;
LINE_COMMENT : '--' ~[\r\n]* -> skip ;
MULTILINE_COMMENT : '{-' .*? '-}' -> skip ;

ABSTRACT : 'abstract' ;
DATA     : 'data' ;
IF       : 'if' ;
ELSE     : 'else' ;
ITERATE  : 'iterate' ;
READ     : 'read' ;
PRINT    : 'print' ;
RETURN   : 'return' ;
NEW      : 'new' ;
TRUE     : 'true' ;
FALSE    : 'false' ;
NULL     : 'null' ;

AND_OP   : '&&' ;
EQ_OP    : '==' ;
NEQ_OP   : '!=' ;
LE_OP    : '<' ;
PLUS_OP  : '+' ;
MINUS_OP : '-' ;
MULT_OP  : '*' ;
DIV_OP   : '/' ;
MOD_OP   : '%' ;

LBRACE   : '{' ;
RBRACE   : '}' ;
LBRACK   : '[' ;
RBRACK   : ']' ;
LPAREN   : '(' ;
RPAREN   : ')' ;
SEMI     : ';' ;
COMMA    : ',' ;
RANGLE   : '>' ;
COLON    : ':' ;
DCOLON   : '::' ;
DOT      : '.' ;
ASSIGN   : '=' ;

INT_TYPE   : 'Int' ;
CHAR_TYPE  : 'Char' ;
BOOL_TYPE  : 'Bool' ;
FLOAT_TYPE : 'Float' ;

ID: [a-z] [a-zA-Z0-9_]*  ;
TYID : [A-Z] [a-zA-Z0-9_]*  ;
INT : [0-9]+  ;
FLOAT : [0-9]* '.' [0-9]+  ;
CHAR : '\'' ( ESC_SEQ | ~['\\\r\n] ) '\''  ;

fragment ESC_SEQ : '\\' [ntrb\\']          
    | '\\' [0-9][0-9][0-9]  ;
    
// --------------------------------------------------- //
