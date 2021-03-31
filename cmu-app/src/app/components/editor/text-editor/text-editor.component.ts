import {Component, OnInit} from '@angular/core';



@Component({
  selector: 'app-text-editor',
  templateUrl: './text-editor.component.html',
  styleUrls: ['./text-editor.component.scss']
})
export class TextEditorComponent implements OnInit {

  editorOptions = {
    theme: 'vs-light',
    language: 'text',
    lineNumbers: 'false',
    borderRadius: '5',
    minimap: {
      enabled: 'true'
    }
  };
  code: string = '';

  constructor() {
  }

  ngOnInit() {
  }
}
