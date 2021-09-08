import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DetalhesComponent } from './detalhes/detalhes.component';
import { HomeComponent } from './home/home.component';
import { PersonagensComponent } from './personagens/personagens.component';

const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'personagens', component: PersonagensComponent},
  {path: 'detalhes/:id', component: DetalhesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
