lexer grammar CoreMarkupLexer;

/*
 *	Lexer Rules
 */
fragment SYM_HEADER         : '#';
fragment SYM_QUESTION       : '*';
fragment SYM_ENUM_QUESTION  : '$';
fragment SYM_DETAIL         : '-';

fragment LETTER             : [a-zA-Z];
fragment DIGIT              : [0-9];
fragment SYMBOL             : [`!@#$%^&*().-];
fragment WS                 : [ \t];

HEADER_TAG                  : SYM_HEADER+ -> pushMode(CONTENT);
NESTED_QUESTION_TAG         : SYM_DETAIL+ (SYM_QUESTION | SYM_ENUM_QUESTION) -> pushMode(CONTENT);
QUESTION_TAG                : (SYM_QUESTION | SYM_ENUM_QUESTION) -> pushMode(CONTENT);
NESTED_DETAIL_TAG           : SYM_DETAIL SYM_DETAIL+ -> pushMode(CONTENT);
DETAIL_TAG                  : SYM_DETAIL+ -> pushMode(CONTENT);
NEWLINE                     : ('\r'? '\n' | '\r') -> skip;

mode CONTENT;
TEXT                        : (LETTER | DIGIT | SYMBOL | WS)+ -> popMode;