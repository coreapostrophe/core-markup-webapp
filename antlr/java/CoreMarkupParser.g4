parser grammar CoreMarkupParser;

options {
    tokenVocab=CoreMarkupLexer;
}

/*
 *	Parser Rules
 */
cmu                         : (header | question)+ EOF;
header                      : HEADER_TAG TEXT+;
question                    : QUESTION_TAG TEXT+ (nested_question | detail)+;
nested_question             : NESTED_QUESTION_TAG TEXT* nested_detail*;
detail                      : DETAIL_TAG TEXT+;
nested_detail               : NESTED_DETAIL_TAG TEXT+;
