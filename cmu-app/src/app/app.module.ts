import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './components/menu/menu.component';
import { DropdownDirective } from './directives/dropdown.directive';

import { EditorModule } from "./components/editor/editor.module";
import { DeckToolModule } from "./components/deck-tool/deck-tool.module";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";

import { onMonacoLoad } from "$app/language/setup";
import { MonacoEditorModule } from '@materia-ui/ngx-monaco-editor';
import { CardDirective } from './directives/card.directive';
import { MenuLinksComponent } from './components/menu/menu-dropdown/menu-links.component';

@NgModule({
    declarations: [
        AppComponent,
        MenuComponent,
        DropdownDirective,
        CardDirective,
        MenuLinksComponent
    ],
    imports: [
        BrowserAnimationsModule,
        BrowserModule,
        AppRoutingModule,
        EditorModule,
        DeckToolModule,
        MonacoEditorModule
    ],
    providers: [],
    exports: [
        DropdownDirective
    ],
    bootstrap: [AppComponent]
})
export class AppModule { }
