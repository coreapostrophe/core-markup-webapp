import { CoreMarkupLanguageWorker } from "$app/workers/CoreMarkupLanguageWorker";
import DiagnosticsAdapter from "$app/workers/DiagnosticsAdapter";
import { WorkerManager } from "$app/workers/WorkerManager";
import { languageID, languageExtensionPoint, monarchLanguage, richLanguageConfiguration } from "./config";

/**
 * Initializes the Monaco editor instance
 */
export function onMonacoLoad() {
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
        monaco.languages.setMonarchTokensProvider(languageID, monarchLanguage);
        monaco.languages.setLanguageConfiguration(languageID, richLanguageConfiguration);

        // Create worker manager
        const client = new WorkerManager();

        const worker: WorkerAccessor = (...uris): Promise<CoreMarkupLanguageWorker> => {
            const serviceWorker = client.getLanguageServiceWorker(...uris);
            return serviceWorker;
        };

        // Call the errors provider
        new DiagnosticsAdapter(worker);
        // monaco.languages.registerDocumentFormattingEditProvider(languageID, new TodoLangFormattingProvider(worker));
    });

    const theme: monaco.editor.IStandaloneThemeData = {
        base: 'vs',
        inherit: false,
        rules: [
            { token: 'header', foreground: '#11A6B1', fontStyle: 'bold' },
            { token: 'header.content', foreground: '#11A6B1', fontStyle: 'bold' },
            { token: 'identifier', foreground: '#474E56' }
        ],
        colors: {
            'editor.foreground': '#000000',
            // 'editor.background': '#EDF9FA',
            // 'editorCursor.foreground': '#8B0000',
            // 'editor.lineHighlightBackground': '#0000FF20',
            // 'editorLineNumber.foreground': '#008800',
            // 'editor.selectionBackground': '#88000030',
            // 'editor.inactiveSelectionBackground': '#88000015'
        }
    }

    monaco.editor.defineTheme('cmuLight', theme);
}

export type WorkerAccessor = (...uris) => Promise<CoreMarkupLanguageWorker>;