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
question                    : QUESTION_TAG label (nested_question | detail)+;
nested_question             : NESTED_QUESTION_TAG label? nested_detail*;
detail                      : DETAIL_TAG label;
nested_detail               : NESTED_DETAIL_TAG label;
