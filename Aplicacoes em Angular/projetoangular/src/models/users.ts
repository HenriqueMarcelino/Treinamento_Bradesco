import { Telefone } from "./telefone";


export class Users{

    idusers : number =0;
    nome: string ="";
    email: string ="";
    password: string ="";
    telefones: Telefone[]=[]

    constructor(iduser: number, nome: string, email: string, password: string){
        this.idusers = iduser;
        this.nome = nome;
        this.email = email;
        this.password = password;
      
    }

}