import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TextEditorComponent } from './text-editor/text-editor.component';
import { EditorRoutingModule } from "./editor-routing.module";
import { FormsModule } from "@angular/forms";
import { MonacoEditorModule } from 'ngx-monaco-editor';

@NgModule({
  declarations: [TextEditorComponent],
  imports: [
    CommonModule,
    MonacoEditorModule,
    EditorRoutingModule,
    FormsModule
  ]
})
export class EditorModule { }
