lexer grammar  LEXERCONTROLLER;

SPACE : ' ' -> skip;
UN:'\n' ->skip;
UT:'\t' ->skip;
UR:'\r' ->skip;
CURLYOPEN  : '{' ;
CURLYCLOSE : '}' ;
SUM: '+';
DIVID: '/';
MULTIPLY : '*';
MINUS : '-';
OPENTEXT: '(';
CLOSETEXT: ')';
SUMS : '++';
MINUSS : '--';
OR:'||';
FOR : 'for';
AND : '&&';
SUM_EQUAL:'+=';
MINUS_EQUAL:'-=';
EQUALEQUAL : '==';
DIVID_EQUAL : '/=';
MULTIPLY_EQUAL : '*=';
NOT_EQUAL : '!=';
IF : 'if';
ELSE : 'else';
ELSE_IF : 'else if';
Array : 'array';
DOUBLE_QUOTE : '"';
SIZES : [0-9]+'px' | [0-9]+'rem' | [0-9]+'dp';
COMMA : ',' ;
CONTENT : 'Content';
COLOR :'Color';
COUNT : 'count' ;
TEXT_HINT : 'TextHint';
COMMENT: '//';
TAG_OPEN : '<';
TAG_OPEN_EQUAL : '<=';

DOT: '.' ;
GET_DATA : 'getData';
PRINT :'print';
TAG_CLOSE : '>';
TAG_CLOSE_EQUAL:'>=';
CONTROLLER : 'controller';
EQUAL: '=' ;
SINGLE_QUOTE : '\'';
//NUMBER: [0-9]+;
SEMICOLON : ';';
CHARS : [a-zA-Z0-9]+ (' ' [a-zA-Z0-9]+)* ;
//mode header;
//mode body;
//mode title;
//mode button;
//mode text;




