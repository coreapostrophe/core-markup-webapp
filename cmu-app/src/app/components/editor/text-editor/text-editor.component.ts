import { Component, OnInit } from '@angular/core';
import { languageID } from "$app/language/config";
import { MonacoEditorLoaderService } from '@materia-ui/ngx-monaco-editor';
import { filter, take } from 'rxjs/operators';
import { onMonacoLoad} from "$app/language/setup";

@Component({
  selector: 'app-text-editor',
  templateUrl: './text-editor.component.html',
  styleUrls: ['./text-editor.component.scss']
})
export class TextEditorComponent implements OnInit {

  editorOptions = {
    theme: 'vs-dark',
    language: languageID,
    lineNumbers: true,
    borderRadius: '5',
    minimap: {
      enabled: true
    }
  };
  code: string = '';

  constructor(
    private monacoLoaderService: MonacoEditorLoaderService
  ) {
    // Is Monaco editor loaded
    this.monacoLoaderService.isMonacoLoaded$.pipe(
      filter(isLoaded => isLoaded),
      take(1),
    ).subscribe(() => {
      onMonacoLoad()
    });
  }

  ngOnInit() {

  }
}
