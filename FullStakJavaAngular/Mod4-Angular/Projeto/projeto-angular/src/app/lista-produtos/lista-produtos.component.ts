import { Component } from '@angular/core';
import { Produto } from '../models/produto';

@Component({
  selector: 'app-lista-produtos',
  templateUrl: './lista-produtos.component.html',
  styleUrls: ['./lista-produtos.component.css']
})
export class ListaProdutosComponent {
  query: string = '';

  pesquisar() {
    this.query = '';
  }

  produto!: Produto; //??? sem essa ddeclaração da erro no html

  carrinho: Produto[] = [];

  produtos: Produto[] = [
    {
      imagem: 'https://via.placeholder.com/150',
      nome: 'Relogio Band 5',
      preco: 200,
      emPromocao: false,
      categoria: 'eletro',
    },
    {
      imagem: 'https://via.placeholder.com/150',
      nome: 'Relogio smartwatch Xiaomi',
      preco: 300,
      emPromocao: true,
      categoria: 'eletro',
    },
    {
      imagem: 'https://via.placeholder.com/150',
      nome: 'Mesa de madeira',
      preco: 855,
      emPromocao: false,
      categoria: 'moveis',
    }
  ] ;

  adicionarProduto(produto: Produto): void {
    this.carrinho.push(produto);
  }

  existeNoCarrinho(produto: Produto): boolean {
    return this.carrinho.indexOf(produto) > -1;
  }

}
