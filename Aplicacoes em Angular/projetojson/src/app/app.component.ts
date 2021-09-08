import { Component, OnInit } from '@angular/core';
import { Usuario } from './model/usuario';
import { UsuarioService } from './service/usuario.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'projetojson';

  usuarios: Usuario[]=[];
  usuaario: Usuario;

  constructor(private service: UsuarioService){
    this.usuaario = new Usuario();

  }
  ngOnInit(): void {
    this.lista
  }

  public lista(){
    this.service.findAll().subscribe(res => {
      this.usuarios = res;
    });
  }

  public gravar(){
    this.service.create(this.usuaario).subscribe(res =>{ 
      console.log("Usuario gravado com sucesso!",res)
     })
     this.lista();
  }
  
}
