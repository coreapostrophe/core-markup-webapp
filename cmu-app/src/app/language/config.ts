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

    // keywords: ['COMPLETE', 'ADD'],
    // typeKeywords: ['TODO'],
    escapes: /\\(?:[abfnrtv\\"']|x[0-9A-Fa-f]{1,4}|u[0-9A-Fa-f]{4}|U[0-9A-Fa-f]{8})/,
    includeLF: true,
    // The main tokenizer for our languages
    tokenizer: {
        root: [
            // identifiers and keywords
            [/[a-zA-Z_$.][\w$]*/, {
                cases: {
                    // '@keywords': { token: 'keyword' },
                    // '@typeKeywords': { token: 'type' },
                    '@default': 'identifier'
                }
            }],
            // whitespace
            { include: '@whitespace' },

            [/(#)+ /, 'header', '@header'],

            // strings for options
            [/"([^"\\]|\\.)*$/, 'string.invalid'],  // non-teminated string
            [/"/, 'string', '@string'],
        ],
        header: [
            { include: '@whitespace' },
            [/[a-zA-Z_$.]/, 'header.content'],
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