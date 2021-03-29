import { CmuContext } from "$antlr/CoreMarkupLexer";
// import { parseAndGetASTRoot, parseAndGetSyntaxErrors } from "./parser";
import { CoreMarkupError } from "./error.listener";

export default class CoreMarkupLanguageService {
    validate(code: string): CoreMarkupError[] {
        const syntaxErrors: CoreMarkupError[] = parseAndGetSyntaxErrors(code);
        //Later we will append semantic errors
        return syntaxErrors;
    }
}