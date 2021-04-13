import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './components/menu/menu.component';
import { DropdownDirective } from './directives/dropdown.directive';

import { EditorModule } from "./components/editor/editor.module";
import { DeckToolModule } from "./components/deck-tool/deck-tool.module";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";

import { MonacoEditorModule } from '@materia-ui/ngx-monaco-editor';
import { MenuLinksComponent } from './components/menu/menu-dropdown/menu-links.component';
import { ToolsPanelComponent } from './components/menu/tools-panel/tools-panel.component';
import { ModalDirective } from './directives/modal.directive';
import { TestModalComponent } from './components/modals/test-modal/test-modal.component';

@NgModule({
    declarations: [
        AppComponent,
        MenuComponent,
        DropdownDirective,
        MenuLinksComponent,
        ToolsPanelComponent,
        ModalDirective,
        TestModalComponent
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
