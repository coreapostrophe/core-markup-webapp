parser grammar CoreMarkupParser;

options {
    tokenVocab=CoreMarkupLexer;
}

/*
 *	Parser Rules
 */
cmu                         : (header | question)+ EOF;
label                       : TEXT+;
header                      : HEADER_TAG label;
question                    : QUESTION_TAG label (question_detail | detail)+;
question_detail             : QUESTION_DETAIL_TAG label? nested_detail*;
nested_detail               : NESTED_DETAIL_TAG label;
detail                      : DETAIL_TAG label;