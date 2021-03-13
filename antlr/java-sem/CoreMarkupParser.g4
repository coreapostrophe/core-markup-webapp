parser grammar CoreMarkupParser;

options {
    tokenVocab=CoreMarkupLexer;
}

@members {
    int level = 0;

    public int len(Token token) {
        return token != null ? token.getText().length() : 0;
    }

    public void reset() {
        this.level = 0;
    }
}

/*
 *	Parser Rules
 */
cmu                         : (header | question)+ EOF;
label                       : TEXT+;
header                      : HEADER_TAG label;

question                    : { reset(); } t=QUESTION_TAG label  { level++; } (question_detail | detail)+;
question_detail             : qd=QUESTION_DETAIL_TAG { len($qd) - 1 == level }? label { level++; } (question_detail | nested_detail)+;
nested_detail               : nd=NESTED_DETAIL_TAG { len($nd) == level }? label;
detail                      : d=DETAIL_TAG { len($d) == level }? label;