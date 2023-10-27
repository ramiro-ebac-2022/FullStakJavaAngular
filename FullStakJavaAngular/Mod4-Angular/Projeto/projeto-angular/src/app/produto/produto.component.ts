import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Produto } from '../models/produto';

@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html',
  styleUrls: ['./produto.component.css']
})
export class ProdutoComponent {
  @Input() produto!: Produto;
  @Output() onCarrinho = new EventEmitter<Produto>();  //emisor de eventos

  largura : number = 200.0;
  altura : number = 150.0;

  adicionarProduto() {
    this.altura += 15;
    this.largura += 15;
    alert("Produto adicionado ao carrinho!");
    this.onCarrinho.emit(this.produto);
  }

  promocao() {
    confirm("Interessado neste produto ?");
  }
}
