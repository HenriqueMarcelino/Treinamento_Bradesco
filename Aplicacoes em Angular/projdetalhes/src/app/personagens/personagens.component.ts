import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Personagens } from '../model/personagens';
import { PersonagemService } from '../service/personagem.service';

@Component({
  selector: 'app-personagens',
  templateUrl: './personagens.component.html',
  styleUrls: ['./personagens.component.css']
})
export class PersonagensComponent implements OnInit {

  personagem: Personagens;
  personagens: Personagens[]=[];
  personagensSelect: Personagens;

  constructor(private service: PersonagemService, 
    private router: Router) {
      this.personagem = new Personagens();
     }

  ngOnInit(): void {
    this.listar();
  }

  listar(){
    this.service.listarPersonagens().subscribe(res => {
      this.personagens = res;
      console.log(res);
    })
  }

}
