parser grammar CoreMarkupParser;

options {
    tokenVocab=CoreMarkupLexer;
}

@members {

STARTING_LEVEL = 1
level = STARTING_LEVEL

def get_length(self, token):
    length = len(token._text) if token._text is not None else CoreMarkupParser.STARTING_LEVEL
    return length

def reset(self):
    CoreMarkupParser.level = CoreMarkupParser.STARTING_LEVEL

def bounds(self, token, offset):
    length = self.get_length(token) + offset
    return length >= CoreMarkupParser.STARTING_LEVEL and length <= CoreMarkupParser.level
}

/*
 *	Parser Rules
 */
cmu                         : (header | question)+ EOF;
label                       : TEXT+;
header                      : HEADER_TAG label;

question                    : {self.reset()} t=QUESTION_TAG label (question_detail | detail)+;
question_detail             : qd=QUESTION_DETAIL_TAG {self.bounds($qd, -1)}? label {CoreMarkupParser.level = self.get_length($qd)} (question_detail | nested_detail)+;
nested_detail               : nd=NESTED_DETAIL_TAG {self.bounds($nd, 0)}? label;
detail                      : d=DETAIL_TAG {self.bounds($d, 0)}? label;