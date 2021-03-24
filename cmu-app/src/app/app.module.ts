import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './components/menu/menu.component';
import { DropdownDirective } from './directives/dropdown.directive';
import { EditorModule } from "./components/editor/editor.module";
import { DeckToolModule } from "./components/deck-tool/deck-tool.module";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";

import { MonacoEditorModule, NgxMonacoEditorConfig } from 'ngx-monaco-editor';
import { onMonacoLoad } from "$app/language/setup";

const monacoConfig: NgxMonacoEditorConfig = {
    defaultOptions: { scrollBeyondLastLine: false },
    onMonacoLoad
};

@NgModule({
    declarations: [
        AppComponent,
        MenuComponent,
        DropdownDirective
    ],
    imports: [
        BrowserAnimationsModule,
        BrowserModule,
        AppRoutingModule,
        EditorModule,
        DeckToolModule,
        MonacoEditorModule.forRoot(monacoConfig)
    ],
    providers: [],
    exports: [
        DropdownDirective
    ],
    bootstrap: [AppComponent]
})
export class AppModule { }
