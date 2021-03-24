import * as monaco from "monaco-editor-core";

import Uri = monaco.Uri;
import { CoreMarkupLanguageWorker } from './CoreMarkupLanguageWorker';
import { languageID } from "$app/language/config";

export class WorkerManager {

    private worker: monaco.editor.MonacoWebWorker<CoreMarkupLanguageWorker>;
    private workerClientProxy: Promise<CoreMarkupLanguageWorker>;

    constructor() {
        this.worker = null;
    }

    private getClientProxy(): Promise<CoreMarkupLanguageWorker> {
        if (!this.workerClientProxy) {
            this.worker = monaco.editor.createWebWorker<CoreMarkupLanguageWorker>({
                // module that exports the create() method and returns a `JSONWorker` instance
                moduleId: 'CoreMarkupLanguageWorker',
                label: languageID,
                // passed in to the create() method
                createData: {
                    languageId: languageID,
                }
            });

            this.workerClientProxy = <Promise<CoreMarkupLanguageWorker>><any>this.worker.getProxy();
        }

        return this.workerClientProxy;
    }

    async getLanguageServiceWorker(...resources: Uri[]): Promise<CoreMarkupLanguageWorker> {
        const _client: CoreMarkupLanguageWorker = await this.getClientProxy();
        await this.worker.withSyncedResources(resources)
        return _client;
    }
}