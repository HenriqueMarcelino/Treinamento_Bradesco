import { Component, OnInit } from '@angular/core';
import { Telefone } from 'src/models/telefone';
import { Users } from 'src/models/users';
import { UsersService } from 'src/service/users-services';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {
 
  users: Users;
  listausers: Users[]=[];

  constructor(private service: UsersService){
    this.users = new Users(0, "none", "none", "none");
    this.users.telefones.push (new Telefone());
    this.users.telefones.push (new Telefone());

  }

  ngOnInit(): void {
    //this.lista();
  }

}





