import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { DropdownDirective } from './directives/dropdown.directive';
import {EditorModule} from "./editor/editor.module";
import {MonacoEditorModule} from "ngx-monaco-editor";
import {DeckToolModule} from "./deck-tool/deck-tool.module";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";

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
        MonacoEditorModule.forRoot()
    ],
    providers: [],
    exports: [
        DropdownDirective
    ],
    bootstrap: [AppComponent]
})
export class AppModule { }
