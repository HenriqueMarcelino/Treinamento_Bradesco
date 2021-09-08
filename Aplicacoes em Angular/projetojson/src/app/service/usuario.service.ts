import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Usuario } from "../model/usuario";

@Injectable()
export class UsuarioService{

    constructor(private http: HttpClient){

    }

    public findAll(){
        return this.http.get<Usuario[]>("http://localhost:3000/usuario");
    }

    public create(usuario: Usuario){
        return this.http.post<Usuario>("http://localhost:3000/usuario",usuario);

    }
}