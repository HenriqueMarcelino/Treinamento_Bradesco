import { IAluno } from "./IAluno";

export class Aluno implements IAluno{
    id: number = 0;
    nome: string = "";
    email: string = "";
    disciplina: string = "";
    nota1 : number = 0;
    nota2 : number = 0;
    media : number = 0;
    situacao : string = "";

    constructor(id ?: number, nome ?: string, email ?: string, disciplina ?: string, nota1 ?: number,
         nota2 ?: number, media ?: number, situacao ?: string
          ){
              this.id = id;
              this.nome = nome;
              this.email = email;
              this.disciplina = disciplina;
              this.nota1 = nota1;
              this.nota2 = nota2;
              this.media = media;
              this.situacao = situacao;
          }

}