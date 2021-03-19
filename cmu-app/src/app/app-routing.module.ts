import { NgModule } from '@angular/core';
import {Routes, RouterModule, PreloadAllModules} from '@angular/router';

const routes: Routes = [
  {path:'', redirectTo:'Editor', pathMatch:'full'},
  {path:'Editor', loadChildren:()=>import('./components/editor/editor.module').then(m=>m.EditorModule)},
  {path:'Decks', loadChildren:()=>import('./components/deck-tool/deck-tool.module').then(m=>m.DeckToolModule)}
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {preloadingStrategy: PreloadAllModules})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
