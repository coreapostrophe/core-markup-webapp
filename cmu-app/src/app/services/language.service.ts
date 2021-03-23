// import { CmuContext } from "$app/language/antlr/CoreMarkupLexer";
import { parseAndGetASTRoot, parseAndGetSyntaxErrors } from "../language/parser";
import { CoreMarkupError } from "../language/error.listener";

export default class CoreMarkupLanguageService {
    validate(code: string): CoreMarkupError[] {
        const syntaxErrors: CoreMarkupError[] = parseAndGetSyntaxErrors(code);
        //Later we will append semantic errors
        return syntaxErrors;
    }
}