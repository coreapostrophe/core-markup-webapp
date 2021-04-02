
import { ANTLRErrorListener, RecognitionException, Recognizer } from "antlr4ts";

export interface CoreMarkupError {
    startLineNumber: number;
    startColumn: number;
    endLineNumber: number;
    endColumn: number;
    message: string;
    code: string;
}

export default class CoreMarkupErrorListener implements ANTLRErrorListener<any>{
    private errors: CoreMarkupError[] = []

    /**
     * Error messages translation look-up table (antlrMessage -> friendlyMessage)
     */
    private translations = {
        "rule detail failed predicate: {this.bounds($d, 0)}?": "Detail is not within nesting level",
        "rule question_detail failed predicate: {this.bounds($qd, -1)}?": "Detail is not within nesting level",
        "mismatched input '<EOF>' expecting TEXT": "Expecting text after tag",
        "mismatched input '<EOF>' expecting {QUESTION_DETAIL_TAG, DETAIL_TAG}": "Expecting a detail after question",
        "mismatched input '<EOF>' expecting {OPTION_TAG, HEADER_TAG, QUESTION_TAG}": "Expecting an option, header, or question"
    };

    /**
     * @override
     * 
     * Listens for syntax errors when traversing the parse tree
     * 
     * @param recognizer 
     * @param offendingSymbol 
     * @param line 
     * @param charPositionInLine 
     * @param message 
     * @param e 
     */
    syntaxError(
        recognizer: Recognizer<any, any>,
        offendingSymbol: any,
        line: number,
        charPositionInLine: number,
        antlrMessage: string,
        e: RecognitionException | undefined): void {

        // Push the language error
        this.errors.push(
            {
                startLineNumber: line,
                endLineNumber: line,
                startColumn: charPositionInLine,
                endColumn: charPositionInLine + 1, //Let's suppose the length of the error is only 1 char for simplicity
                message: this.getFriendlyMessage(antlrMessage),
                code: "1" // This the error code you can customize them as you want
            }
        );
    }

    /**
     * Translates ANTLR error messages into clearer messages
     * @param message 
     * @returns 
     */
    getFriendlyMessage(antlrMessage: string) {
        const trans = this.translations[antlrMessage];
        return trans ? trans : antlrMessage;
    }

    /** Returns the list of gathered errors */
    getErrors(): CoreMarkupError[] {
        return this.errors;
    }
}