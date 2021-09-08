import { Component } from '@angular/core';
import { Aluno } from './model/aluno';
import { AlunoService } from './service/aluno-service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'projetoassincrono';
  aluno : Aluno;

  constructor(private _service : AlunoService){
    this.aluno = new Aluno(10,"Henrique", "henrique@gmail.com", "Angular", 10, 10 );

  }

  public actionCalcular(){
    this.aluno = this._service.gerarMedia(this.aluno)
  }

}
