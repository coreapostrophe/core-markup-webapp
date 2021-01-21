import {TextEditorComponent} from "./text-editor/text-editor.component";
import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";

const routes: Routes = [
  {
    path:'',
    component: TextEditorComponent,
    children:[
      {path:'', component:TextEditorComponent, pathMatch:'full'}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})

export class EditorRoutingModule { }
