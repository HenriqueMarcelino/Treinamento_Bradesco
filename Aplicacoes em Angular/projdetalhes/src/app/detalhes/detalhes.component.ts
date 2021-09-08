import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Personagens } from '../model/personagens';
import { PersonagemService } from '../service/personagem.service';

@Component({
  selector: 'app-detalhes',
  templateUrl: './detalhes.component.html',
  styleUrls: ['./detalhes.component.css']
})
export class DetalhesComponent implements OnInit {

  personagens: Personagens[]=[];
  personagemSelecionado: Personagens;

  constructor(private service: PersonagemService,
    private router: ActivatedRoute
    ) {
       this.personagemSelecionado = new Personagens();
      }

  ngOnInit(): void {
    this.lista();
    this.router.params.subscribe(param =>{
    let id = param.id;
    this.personagemSelecionado = this.personagens.find(item => item.id== +id)
    console.log('Personagem selecionado', this.personagemSelecionado);
    })
  }

  lista(){
    this.service.listarPersonagens().subscribe(res => {
      this.personagens = res;
    })
  }

}
