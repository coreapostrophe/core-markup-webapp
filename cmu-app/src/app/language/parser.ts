import { CoreMarkupParser, CmuContext } from "$app/language/antlr/CoreMarkupParser";
import { CoreMarkupLexer } from "$app/language/antlr/CoreMarkupLexer";
import { ANTLRInputStream, CommonTokenStream } from "antlr4ts";
import CoreMarkupErrorListener, { CoreMarkupError } from "./error.listener";

export function parse(code: string): { ast: CmuContext, errors: CoreMarkupError[] } {
    const coreMarkupErrorsListener = new CoreMarkupErrorListener();

    // Setup lexer
    const inputStream = new ANTLRInputStream(code);
    const lexer = new CoreMarkupLexer(inputStream);
    lexer.removeErrorListeners();
    lexer.addErrorListener(coreMarkupErrorsListener);

    // Setup parser
    const tokenStream = new CommonTokenStream(lexer);
    const parser = new CoreMarkupParser(tokenStream);
    parser.removeErrorListeners();
    parser.addErrorListener(coreMarkupErrorsListener);

    // Begin parsing to retrieve Abstract Syntax Tree
    const ast = parser.cmu();
    const errors: CoreMarkupError[] = coreMarkupErrorsListener.getErrors();
    return { ast, errors };
}

export function parseAndGetASTRoot(code: string): CmuContext {
    const { ast } = parse(code);
    return ast;
}

export function parseAndGetSyntaxErrors(code: string): CoreMarkupError[] {
    const { errors } = parse(code);
    return errors;
}