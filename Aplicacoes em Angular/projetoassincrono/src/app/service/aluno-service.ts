import { Injectable } from "@angular/core";
import { Aluno } from "../model/aluno";


@Injectable()
export class AlunoService{

    constructor(){

    }

    public gerarMedia(a : Aluno):Aluno{

        if ((a.media = (a.nota1 + a.nota2)/2) >= 7){
             a.situacao = "Aprovado";
    }else{
        a.situacao = "Reprovado";
    }
    return a;
    }
}