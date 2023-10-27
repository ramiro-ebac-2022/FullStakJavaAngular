import { Injectable } from '@angular/core';
import { Produto } from '../models/produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  private produtos: Produto[] = [
    {
      cod: 101,
      nome: 'Marmita térmica',
      descricao: 'Marmita 1ml',
      preco: 178.99,
      imagem: 'https://picsum.photos/200'
    },
    {
      cod: 102,
      nome: 'Relógio',
      descricao: 'Relógio de parede',
      preco: 120.34,
      imagem: 'https://picsum.photos/200'
    },
    {
      cod: 103,
      nome: 'Suporte de headset',
      descricao: 'Suporte portátil para headset',
      preco: 178.99,
      imagem: 'https://picsum.photos/200'
    },
    {
      cod: 104,
      nome: 'Óculos de sol',
      descricao: 'Óculos de sol marca Nike',
      preco: 54.00,
      imagem: 'https://picsum.photos/200'
    }
  ];

  listarProdutos(): Produto[] {
    return this.produtos;
  }

  getProduto(cod: number): Produto | undefined {
    return this.produtos.find( (prod) => prod.cod == cod );
  }

}
