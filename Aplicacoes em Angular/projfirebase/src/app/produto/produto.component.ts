import { Component, OnInit } from '@angular/core';
import { AngularFirestore, AngularFirestoreCollection } from 'angularfire2/firestore';
import { Produto } from '../model/produto';


@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html',
  styleUrls: ['./produto.component.css']
})
export class ProdutoComponent implements OnInit {

  produto: Produto;
  produtos: Produto[]=[];
  collectionProduto: AngularFirestoreCollection<Produto>

  constructor(private fire: AngularFirestore) {
    this.produto = new Produto();
   }

  ngOnInit(): void {
    this.listar();
  }

  gravar(){
    this.collectionProduto.add({...this.produto}).then(res => {
      //console.log('Produto gravado', this.produto);
      this.listar();
      this.produto = new Produto();
    })

  }

  listar(){
    this.collectionProduto = this.fire.collection('produtos');
    this.collectionProduto.valueChanges().subscribe(res => {
      this.produtos = res;
    })
  }

}
