import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { DropdownDirective } from './directives/dropdown.directive';
import {EditorModule} from "./editor/editor.module";
import {MonacoEditorModule} from "ngx-monaco-editor";

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    DropdownDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    EditorModule,
    MonacoEditorModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
