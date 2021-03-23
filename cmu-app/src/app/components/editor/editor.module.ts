import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TextEditorComponent } from './text-editor/text-editor.component';
import { EditorRoutingModule } from "./editor-routing.module";
import { FormsModule } from "@angular/forms";
import { MonacoEditorModule, NgxMonacoEditorConfig } from "ngx-monaco-editor";
import { onMonacoLoad } from "$app/language";

const monacoConfig: NgxMonacoEditorConfig = {
  baseUrl: 'assets',
  defaultOptions: { scrollBeyondLastLine: false }, 
  onMonacoLoad
};

@NgModule({
  declarations: [TextEditorComponent],
  imports: [
    CommonModule,
    MonacoEditorModule.forRoot(monacoConfig),
    EditorRoutingModule,
    FormsModule
  ]
})
export class EditorModule { }
