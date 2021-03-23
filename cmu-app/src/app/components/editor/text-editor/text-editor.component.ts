import {Component, OnInit} from '@angular/core';
import { parse } from '$app/language/parser';


@Component({
  selector: 'app-text-editor',
  templateUrl: './text-editor.component.html',
  styleUrls: ['./text-editor.component.scss']
})
export class TextEditorComponent implements OnInit {

  editorOptions = {
    theme: 'vs-light',
    language: 'text',
    lineNumbers: 'off',
    borderRadius: '5',
    minimap: {
      enabled: 'false'
    }
  };
  code: string = '';

  constructor() {
  }

  ngOnInit() {

  }
}
