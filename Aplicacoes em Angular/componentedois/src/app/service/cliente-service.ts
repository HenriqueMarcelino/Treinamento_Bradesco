import { Injectable } from "@angular/core";
import { clientes } from "../mockdatabase/clientes";

import { Cliente } from "../model/cliente";

@Injectable()
export class ClienteService{

    constructor(){

    }

    public switchCliente(code : number): Cliente{
        for(let i=0; i<3; i++){
            if(clientes[i].id == code){
                return clientes[i];
            }
        }
        throw Error ("Não encontrado");
    }

}