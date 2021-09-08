import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Funcionario } from '../model/funcionario';

const URL = 'http://localhost:3000/funcionarios';


@Injectable({
  providedIn: 'root'
})
export class FuncionarioService {

  constructor( private http: HttpClient) { 

  }

  public findAll(){
    return this.http.get<Funcionario[]>('${URL}');
  }

  public create(funcionario : Funcionario){
    return this.http.post<Funcionario>('${URL}',funcionario);
  }
  
}
