import { CoreMarkupLanguageWorker } from "$app/workers/CoreMarkupLanguageWorker";
import DiagnosticsAdapter from "$app/workers/DiagnosticsAdapter";
import { WorkerManager } from "$app/workers/WorkerManager";
import { languageID, languageExtensionPoint } from "./config";

/**
 * Initializes the Monaco editor instance
 */
export function onMonacoLoad() {
    const monaco = (window as any).monaco;

    new Worker("../workers/language.worker.ts", { name: "coremarkup", type: "module" });

    const coreMarkupWorkerUrl = "./coremarkup.worker.js";
    const editorWorkerUrl = "./editor.worker.js";

    (window as any).MonacoEnvironment = {
        getWorkerUrl: function (moduleId, label) {
            if (label === languageID) {
                return coreMarkupWorkerUrl;
            }
            return editorWorkerUrl;
        }
    }

    // Register CMU language
    monaco.languages.register(languageExtensionPoint);
    monaco.languages.onLanguage(languageID, () => {
        // monaco.languages.setMonarchTokensProvider(languageID, monarchLanguage);
        // monaco.languages.setLanguageConfiguration(languageID, richLanguageConfiguration);

        // Create worker manager
        const client = new WorkerManager();

        const worker: WorkerAccessor = (...uris): Promise<CoreMarkupLanguageWorker> => {
            const serviceWorker = client.getLanguageServiceWorker(...uris);
            return serviceWorker;
        };

        //Call the errors provider
        new DiagnosticsAdapter(worker);
        // monaco.languages.registerDocumentFormattingEditProvider(languageID, new TodoLangFormattingProvider(worker));
    });
}

export type WorkerAccessor = (...uris) => Promise<CoreMarkupLanguageWorker>;