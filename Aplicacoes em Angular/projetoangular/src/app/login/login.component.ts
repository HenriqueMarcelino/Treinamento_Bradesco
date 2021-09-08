import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Users } from 'src/models/users';
import { UsersService } from 'src/service/users-services';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  users: Users;

  constructor(private service: UsersService, private router: Router) { 
    this.users = new Users(0,"", "", "");
  }

  ngOnInit(): void {
  }

  logar(){
    this.service.login(this.users).subscribe( res =>{
      this.router.navigateByUrl('/cadastro');
    }, error => {
      console.log("erro", error);
      this.router.navigateByUrl('/login');
    })

  }

}
