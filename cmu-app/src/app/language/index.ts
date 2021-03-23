/**
 * Language ID for Core Markup
 */
export const languageID = "coreMarkup";

/**
 * Initializes the Monaco editor instance
 */
export function onMonacoLoad() {
    console.log((window as any).monaco);

    const coreMarkupWorkerUrl = "coremarkup.worker.js";
    const editorWorkerUrl = "editor.worker.js";

    (window as any).MonacoEnvironment = {
        getWorker: function (moduleId, label) {
            if (label === languageID) {
                return new Worker("../workers/language.worker", { name: "coremarkup", type: "module" }); // This has to be called somewhere.
            }
            return new Worker("../../node_modules/monaco-editor-core/esm/vs/editor/editor.worker.js")
        }
    }
}