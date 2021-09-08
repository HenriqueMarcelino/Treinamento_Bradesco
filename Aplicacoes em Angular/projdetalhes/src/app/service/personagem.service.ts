import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Personagens } from '../model/personagens';

@Injectable({
  providedIn: 'root'
})
export class PersonagemService {

  PERSONAGENS = [
    {
      id:1,
      nome:"Arno Victor Dorian",
      descricao: "Arno é o primeiro assassino totalmente francês na história da série. Ele vive na época da Revolução Francesa e tem um papel importante da Ordem por lá. Apesar de seu jogo, Assassin’s Creed Unity, ter recebido algumas críticas, ele é carismático e bem desenvolvido.",
      imagem: "https://s2.glbimg.com/0zkrqzrwzyOZENtW_-LpyHs_7qE=/695x0/s.glbimg.com/po/tt2/f/original/2015/02/28/arno-ac-unity.jpg"

    },
    {
      id:2,
      nome:"Shay Patrick Cormac",
      descricao: "Shay é o personagem central de Assassin’s Creed Rogue e, apesar disso, não é bem um assassino, ao menos não ao longo do jogo inteiro. Ele começa sua aventura como um assassino da Ordem, mas logo trai seus mestres e se torna um Templário.",            
      imagem: "https://s2.glbimg.com/VpNiMARhFbFQizZ4FGjmjhHo47M=/695x0/s.glbimg.com/po/tt2/f/original/2015/02/28/shay-ac-rogue.jpg"
    },
    {
      id:3,
      nome:"Edward James Kenway",
      descricao: "Edward é um pirata que se torna assassino ao longo da história de Assassin’s Creed 4: Black Flag, nas ilhas caribenhas dos EUA. Ele era um nobre britânico, mas enveredou pelos caminhos dos piratas após descobrir verdades de seu passado, também como assassino.",
      imagem: "https://s2.glbimg.com/aI283zva2XtkQIkZT_2IYkdSuKk=/695x0/s.glbimg.com/po/tt2/f/original/2015/02/28/edward-ac-4.jpg"

    },
    {
      id:4,
      nome:"Haytham Kenway",
      descricao: "Haytham é o pai de Connor e também um dos personagens jogáveis em Assassin’s Creed 3. Apesar de tudo, ele é um Templário, e não um assassino. Ele também tem importância singular em títulos como Liberation, Assassin’s Creed 4: Black Flag e Assassin’s Creed Rogue.",
      imagem: "https://s2.glbimg.com/XxiHZULsn21HUDwWZ8lrujswA8c=/695x0/s.glbimg.com/po/tt2/f/original/2015/02/28/haytham-ac-3.jpg"
    },
    {
      id:5, 
      nome:"Aveline de Grandpré",
      descricao: "Aveline é a única personagem central feminina da série Assassin’s Creed, mas representa bem o gênero em Assassin’s Creed 3 Liberation, jogo que também conta com a participação de Connor. Ela agia principalmente na região de Nova Orleans, nos EUA, na mesma época de Connor.",
      imagem: "https://s2.glbimg.com/P84lzBSrD0D33mmvJasasPYTbW0=/695x0/s.glbimg.com/po/tt2/f/original/2015/02/28/aveline-ac-liberation.jpg"
    },
    {
      id:6,
      nome:"Ratonhnhaké:ton",
      descricao: "De nome difícil, Ratonhnhaké:ton é um assassino de raízes indígenas nos Estados Unidos. Também conhecido apenas como “Connor”, ele viveu na época da Guerra Civil norte-americana e participou de atos importantes em Assassin’s Creed 3.",            
      imagem: "https://s2.glbimg.com/5kAI8I9J2k_oyaubxr88LcLo8bU=/695x0/s.glbimg.com/po/tt2/f/original/2015/02/28/connor-ac-3.jpg"
    },
    
  ] as Personagens[];

  constructor() {

   }

   listarPersonagens(): Observable<Personagens[]>{
     return of(this.PERSONAGENS)
   }
}
