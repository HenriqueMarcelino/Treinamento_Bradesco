export class Produto{
    id: number;
    nome: string;
    descricao: string;
    preco: number;
    imagem: string;

    constructor(id?:number, nome?:string, descricao?: string, preco?: number, imagem?:string){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
    }

}