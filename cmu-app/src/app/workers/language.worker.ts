
import * as worker from 'monaco-editor/esm/vs/editor/editor.worker';
import { CoreMarkupLanguageWorker } from './coreMarkupLanguageWorker';

self.onmessage = () => {
  // Initializes a language worker instance
  worker.initialize((ctx) => {
    return new CoreMarkupLanguageWorker(ctx);
  });
}