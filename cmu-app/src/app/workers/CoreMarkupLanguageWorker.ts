import { CoreMarkupError } from "../language/error.listener";
import CoreMarkupLanguageService from "../services/language.service";

export class CoreMarkupLanguageWorker {

    private _ctx: any;
    private _languageService: CoreMarkupLanguageService;

    constructor(ctx: any) {
        this._ctx = ctx;
        this._languageService = new CoreMarkupLanguageService();
    }

    /**
     * Fires language validation
     * @returns array of CoreMarkup errors
     */
    public doValidation(): Promise<CoreMarkupError[]> {
        const code = this.getTextDocument();
        return Promise.resolve(this._languageService.validate(code));
    }

    /**
     * 
     * @returns text value of open Monaco editor instances
     */
    private getTextDocument(): string {
        const model = this._ctx.getMirrorModels()[0];// When there are multiple files open, this will be an array
        return model.getValue();
    }
}