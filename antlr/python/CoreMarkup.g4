grammar CoreMarkup;

/*
 *	Lexer Rules
 */
fragment SYM_HEADER         : '#';
fragment SYM_QUESTION       : '*';
fragment SYM_ENUM_QUESTION  : '$';
fragment SYM_DETAIL         : '-';
fragment TEXT               : ~[\r\n]*;

HEADER                      : SYM_HEADER+ TEXT;
QUESTION                    : (SYM_QUESTION | SYM_ENUM_QUESTION)+ TEXT;
QUESTION_NEST               : SYM_DETAIL+ (SYM_QUESTION | SYM_ENUM_QUESTION) TEXT;
DETAIL_NEST                 : SYM_DETAIL SYM_DETAIL+ TEXT;
DETAIL                      : SYM_DETAIL TEXT;
NEWLINE                     : ('\r'? '\n' | '\r') -> skip;

/*
 *	Parser Rules
 */
cmu                         : (question | header)+ EOF;
header                      : HEADER;
question                    : QUESTION (nested_question | DETAIL)+;
nested_question             : QUESTION_NEST (nested_question | DETAIL_NEST)+;