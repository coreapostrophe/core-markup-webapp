parser grammar CoreMarkupParser;

options {
    tokenVocab=CoreMarkupLexer;
}

@members {
    final int STARTING_LEVEL = 1;
    int level = STARTING_LEVEL;

    public int len(Token token) {
        return token != null ? token.getText().length() : this.STARTING_LEVEL;
    }

    public void reset() {
        this.level = this.STARTING_LEVEL;
    }

    public boolean bounds(Token token, int offset) {
        int length = len(token) + offset;
        return length >= this.STARTING_LEVEL && length <= this.level;
    }
}

/*
 *	Parser Rules
 */
cmu                         : (header | question)+ EOF;
label                       : TEXT+;
header                      : HEADER_TAG label;

question                    : { reset(); } t=QUESTION_TAG label (question_detail | detail)+;
question_detail             : qd=QUESTION_DETAIL_TAG { bounds($qd, -1) }? label { level = len($qd); } (question_detail | nested_detail)+;
nested_detail               : nd=NESTED_DETAIL_TAG { bounds($nd, 0) }? label;
detail                      : d=DETAIL_TAG { bounds($d, 0) }? label;