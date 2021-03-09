grammar CoreMarkup;

/*
 *	Parser Rules
 */
cmu                         : (header | question)+ EOF;
header                      : HEADER_TAG TEXT+;
question                    : QUESTION_TAG TEXT+ (nested_question | detail)+;
nested_question             : NESTED_QUESTION_TAG TEXT* (nested_question | nested_detail)+;
detail                      : DETAIL_TAG TEXT+;
nested_detail               : NESTED_DETAIL_TAG TEXT+;

/*
 *	Lexer Rules
 */
fragment SYM_HEADER         : '#';
fragment SYM_QUESTION       : '*';
fragment SYM_ENUM_QUESTION  : '$';
fragment SYM_DETAIL         : '-';
fragment SYM_COLON          : ':'; 

fragment LOWERCASE          : [a-z];
fragment UPPERCASE          : [A-Z];
fragment DIGIT              : [0-9];
fragment SYMBOL             : [`!@#$%^&*()-];
fragment WS                 : [ \t];

HEADER_TAG                  : SYM_HEADER+ SYM_COLON;
NESTED_QUESTION_TAG         : SYM_DETAIL+ (SYM_QUESTION | SYM_ENUM_QUESTION) SYM_COLON;
QUESTION_TAG                : (SYM_QUESTION | SYM_ENUM_QUESTION) SYM_COLON;
NESTED_DETAIL_TAG           : SYM_DETAIL SYM_DETAIL+ SYM_COLON;
DETAIL_TAG                  : SYM_DETAIL+ SYM_COLON;

TEXT                        : (LOWERCASE | UPPERCASE | DIGIT | SYMBOL | WS)+;
NEWLINE                     : ('\r'? '\n' | '\r') -> skip;