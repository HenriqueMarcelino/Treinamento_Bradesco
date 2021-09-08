import { Component } from '@angular/core';
import { Cliente } from './model/cliente';
import { ClienteService } from './service/cliente-service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'componentedois';

  clienteentrada : Cliente = new Cliente(0, "","",0);
  codigo: number = 0;

  constructor(private _service: ClienteService){

  }

  public escolha(){

    this.clienteentrada = this._service.switchCliente(this.codigo);
  }
}
