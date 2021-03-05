grammar CoreMarkup;

/*
 *	Lexer Rules
 */
fragment SYM_HEADER         : '#';
fragment SYM_QUESTION       : '*';
fragment SYM_ENUM_QUESTION  : '$';
fragment SYM_DETAIL         : '-';

HEADER                      : SYM_HEADER+ ~[\r\n]*;
QUESTION                    : SYM_DETAIL* (SYM_QUESTION | SYM_ENUM_QUESTION)+ ~[\r\n]*;
DETAIL                      : SYM_DETAIL+ ~[\r\n]*;

NEWLINE                     : ('\r'? '\n' | '\r') -> skip;

/*
 *	Parser Rules
 */
cmu                         : (question | HEADER)+ EOF;
question                    : QUESTION (question | DETAIL)+;