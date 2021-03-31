import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './components/menu/menu.component';
import { DropdownDirective } from './directives/dropdown.directive';
import {EditorModule} from "./components/editor/editor.module";
import {MonacoEditorModule} from "ngx-monaco-editor";
import {DeckToolModule} from "./components/deck-tool/deck-tool.module";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import { CardDirective } from './directives/card.directive';

@NgModule({
    declarations: [
        AppComponent,
        MenuComponent,
        DropdownDirective,
        CardDirective
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
