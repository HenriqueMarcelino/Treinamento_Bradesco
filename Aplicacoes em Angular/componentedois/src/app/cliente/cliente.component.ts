import { Component, Input, OnInit } from '@angular/core';
import { Cliente } from '../model/cliente';

@Component({
  selector: 'app-cliente',
  template: `
  </br>
  <label>Id</label>
  <input type="number" [(ngModel)]="clientesaida.id" name="id" readonly class="form-control"/>

  <label>Nome</label>
  <input type="text" [(ngModel)]="clientesaida.nome" name="nome" class="form-control"/>
  
  <label>Email</label>
  <input type="text" [(ngModel)]="clientesaida.email" name="email" class="form-control"/>
  
  <label>Idade</label>
  <input type="number" [(ngModel)]="clientesaida.idade" name="idade" class="form-control"/>
  `
})
export class ClienteComponent implements OnInit {

  @Input() clientesaida !: Cliente;
  constructor() { }

  ngOnInit(): void {
  }

}
