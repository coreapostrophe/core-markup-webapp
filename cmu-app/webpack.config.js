// const WorkerPlugin = require('worker-plugin');
// const NodeTargetPlugin = require('webpack/lib/node/NodeTargetPlugin');

// module.exports = (config, options) => {
//     let workerPlugin = config.plugins.find(p => p instanceof WorkerPlugin);
//     if (workerPlugin) {
//         workerPlugin.options.plugins.push(new NodeTargetPlugin());
//     }
//     return config;
// }

module.exports = {
    entry: {
        "editor.worker": "monaco-editor-core/esm/vs/editor/editor.worker.js"
    },
    // output: {
    //     globalObject: "self"
    // }
}