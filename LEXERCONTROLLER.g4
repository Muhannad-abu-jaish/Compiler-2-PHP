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
AND : '&&';
EQUALEQUAL : '==';
NOT_EQUAL : '!';
IF : 'if';
ELSE : 'else';
DOUBLE_QUOTE : '"';
SIZES : [0-9]+'px' | [0-9]+'rem' | [0-9]+'dp';
COMMA : ',' ;
ON_CLICK : 'onClick';
WIDTH :'Width';
CONTENT : 'Content';
COLOR :'Color';
COMMENT: '//';
BACKGROUND : 'Background';
TAG_OPEN : '<';
TAG_OPEN_EQUAL : '<=';
COLORS : 'Blue'| 'Red' | 'Purple' | 'Yellow' | 'Green'| 'White'| 'Black'| 'Brown';
DOT: '.' ;
GET_DATA : 'getData';
PRINT : 'print';
TAG_CLOSE : '>';
TAG_CLOSE_EQUAL:'>=';
CONTROLLER : 'controller';
EQUAL: '=' ;
SINGLE_QUOTE : '\'';
NUMBER: [0-9]+;
SEMICOLON : ';';
CHARS : ([A-Za-z1-9]|'_')+ ;
//mode header;
//mode body;
//mode title;
//mode button;
//mode text;




