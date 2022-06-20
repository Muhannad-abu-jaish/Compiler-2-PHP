parser grammar PARSERCONTROLLER;
options {tokenVocab = LEXERCONTROLLER;}
program: TAG_OPEN CONTROLLER TAG_CLOSE code_attribute+ ;
code_attribute : variables | on_click |  print  | comment | if_statment | else_statment |for_statement;
for_statement : FOR OPENTEXT CHARS EQUAL (CHARS) SEMICOLON CHARS operation_if (CHARS) SEMICOLON CLOSETEXT;//بدها تزبيط
if_statment : ELSE? IF OPENTEXT (CHARS) operation_if ((CHARS)|( SINGLE_QUOTE CHARS SINGLE_QUOTE))
(logical_sympol (CHARS|) operation_if ((CHARS)|( SINGLE_QUOTE CHARS SINGLE_QUOTE)))* CLOSETEXT CURLYOPEN
 code_attribute+ CURLYCLOSE ;
 logical_sympol : OR | AND;
operation_if : EQUALEQUAL|TAG_CLOSE|TAG_OPEN|TAG_CLOSE_EQUAL|TAG_OPEN_EQUAL|NOT_EQUAL;
else_statment : ELSE CURLYOPEN code_attribute+ CURLYCLOSE ;
comment: COMMENT CHARS;
on_click : CHARS DOT ON_CLICK OPENTEXT CLOSETEXT CURLYOPEN (click_attribute COMMA)* click_attribute COMMA? CURLYCLOSE SEMICOLON;
click_attribute : text | button;
text : CHARS DOT text_attribute;
text_attribute : color | content  ;
content : CONTENT EQUAL SINGLE_QUOTE CHARS SINGLE_QUOTE ;
color : COLOR EQUAL SINGLE_QUOTE COLORS SINGLE_QUOTE  ;
button : CHARS DOT button_attribute;
button_attribute : width | background;
width : WIDTH EQUAL SINGLE_QUOTE SIZES SINGLE_QUOTE  ;
background : BACKGROUND  EQUAL SINGLE_QUOTE COLORS SINGLE_QUOTE  ;
print : PRINT OPENTEXT printattribute CLOSETEXT SEMICOLON;
printattribute : getdata | print_text | CHARS;
getdata : GET_DATA OPENTEXT CHARS CLOSETEXT;
print_text : DOUBLE_QUOTE CHARS DOUBLE_QUOTE;
variables : variable_number |  variable_text | variable_get | textinput ;
variable_number : CHARS EQUAL  CHARS (number_attribute CHARS)* SEMICOLON| adding_one | minus_one | fast_math;
fast_math:  CHARS (SUM_EQUAL|MINUS_EQUAL|DIVID_EQUAL|MULTIPLY_EQUAL) (CHARS) SEMICOLON;
adding_one : CHARS SUMS SEMICOLON ;
minus_one : CHARS MINUSS SEMICOLON;
number_attribute : SUM | DIVID | MULTIPLY | MINUS;
variable_text : CHARS EQUAL SINGLE_QUOTE CHARS SINGLE_QUOTE (SUM SINGLE_QUOTE CHARS SINGLE_QUOTE)* SEMICOLON;
variable_get :CHARS EQUAL getdata SEMICOLON;
textinput : CHARS EQUAL CHARS DOT textinput_attribute SEMICOLON;
textinput_attribute : CONTENT | COLOR | TEXT_HINT;