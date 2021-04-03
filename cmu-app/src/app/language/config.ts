/**
 * Language ID for Core Markup
 */
export const languageID = "coreMarkup";

export const languageExtensionPoint: monaco.languages.ILanguageExtensionPoint = {
    id: languageID,
}

import IRichLanguageConfiguration = monaco.languages.LanguageConfiguration;
import ILanguage = monaco.languages.IMonarchLanguage;

export const richLanguageConfiguration: IRichLanguageConfiguration = {
    // If we want to support code folding, brackets ... ( [], (), {}....), we can override some properties here
    // check the doc
};

export const monarchLanguage = <ILanguage>{
    // Set defaultToken to invalid to see what you do not tokenize yet
    defaultToken: 'invalid',
    includeLF: true,
    unicode: true,
    escapes: /\\(?:[abfnrtv\\"']|x[0-9A-Fa-f]{1,4}|u[0-9A-Fa-f]{4}|U[0-9A-Fa-f]{8})/,

    // The main tokenizer for our languages
    tokenizer: {
        root: [
            // identifiers and keywords
            [/[a-zA-Z]/, {
                cases: {
                    '@default': 'identifier'
                }
            }],
            // whitespace
            { include: '@whitespace' },

            [/(#)+/, 'header', '@header'],
            [/(\*)/, 'question', '@question'],
            [/(\$)/, 'question', '@question'],
            [/(;)/, 'option', '@option'],

            // strings for options
            [/"([^"\\]|\\.)*$/, 'string.invalid'],  // non-teminated string
            [/"/, 'string', '@string'],
        ],

        header: [
            { include: '@whitespace' },
            [/[^\r\n]/, 'header.content'],
            [/[\r\n]+/, '', '@pop']
        ],

        question: [
            { include: '@whitespace' },
            [/[^\r\n]/, 'question.content'],
            [/[\r\n]+/, '', '@pop']
        ],

        option: [
            { include: '@whitespace' },
            [/"/, 'string', '@string'],
            [/[a-zA-Z0-9]/, 'option.content'],
            [/[\r\n]+/, '', '@pop']
        ],

        whitespace: [
            [/[ \t]+/, ''],
        ],
        string: [
            [/[^\\"]+/, 'string'],
            [/@escapes/, 'string.escape'],
            [/\\./, 'string.escape.invalid'],
            [/"/, 'string', '@pop']
        ]
    },
}