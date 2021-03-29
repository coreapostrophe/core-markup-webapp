import { CoreMarkupParser, CmuContext } from "$antlr/CoreMarkupParser";
import { CoreMarkupLexer } from "$antlr/CoreMarkupLexer";
import { ANTLRInputStream, CommonTokenStream } from "antlr4ts";

export default function parseAndGetASTRoot(code: string): CmuContext {
    const inputStream = new ANTLRInputStream(code);
    const lexer = new CoreMarkupLexer(inputStream);
    const tokenStream = new CommonTokenStream(lexer);
    const parser = new CoreMarkupParser(tokenStream);

    return parser.cmu();
}