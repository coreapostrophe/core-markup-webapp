import { Component, OnInit } from '@angular/core';
import { languageID } from "$app/language/config";
import { MonacoEditorLoaderService, MonacoEditorConstructionOptions } from '@materia-ui/ngx-monaco-editor';
import { filter, take } from 'rxjs/operators';
import { onMonacoLoad } from "$app/language/setup";

@Component({
  selector: 'app-text-editor',
  templateUrl: './text-editor.component.html',
  styleUrls: ['./text-editor.component.scss']
})
export class TextEditorComponent implements OnInit {

  editorOptions: MonacoEditorConstructionOptions = {
    theme: 'vs',
    language: languageID,
    lineNumbers: 'off',
    cursorBlinking: 'blink',
    minimap: {
      enabled: false,
    }
  };

  code: string = `# Data Representation
## Number Systems and Base Conversion

$ Base-r to Decimal
-$ 1. Multiply each coefficient with the corresponding power of r
-- 1.1. For the integer part, power of r goes from 0 to n-1 where n is the number of digits in the integer part
-- 1.2. For the fractional part, power of r goes from -1 to -m where m is the number of digits in the fractional part
- 2. Get the sum

$ Decimal to Base-r
-  1. Split the number into its integer part and its fractional part.
-$ 2. Convert integer part to base-r
-- 2.1. Divide the integer by r. Accumulate the remainders
-- 2.2. Repeat step 2.1 until quotient is already equal to zero
-$ 3. Convert fractional part to base-r
-- 3.1. Multiply the fraction by r. Accumulate the integers of the product.
-- 3.2. Repeat step 3.1 until the fractional part of the product is already equal to zero or sufficient accuracy is achieved.`;

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
