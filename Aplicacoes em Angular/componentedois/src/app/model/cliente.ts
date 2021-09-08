export class Cliente{

    id : number =0;
    nome : string ="";;
    email : string ="";;
    idade : number =0;

    constructor(id?:number , nome?: string, email?:string, idade?:number){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

}