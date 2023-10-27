import { Component } from '@angular/core';
import { Aluno } from '../aluno';

@Component({
  selector: 'app-diretivas',
  templateUrl: './diretivas.component.html',
  styleUrls: ['./diretivas.component.css']
})
export class DiretivasComponent {
  estaLigado: boolean = false;
  counter: number = 0;
  listaCompras: string[] = [
    "Batata", "Arroz", "Feijão","Carne"
  ];

  toggle() {
    this.estaLigado = !this.estaLigado;
  }

  incrementar() {
    this.counter++;
  }

  alunos: Aluno[] = [
    {
      nome: "José Carlos",
      email: "jose@gmail.com",
      media: 6.5
    },
    {
      nome: "María Amélia",
      email: "amelia@gmail.com",
      media: 7.5
    },
    {
      nome: "Patricia Vitória",
      email: "patty@gmail.com",
      media: 4.5
    }
  ];

  alertar(aluno: Aluno) {
    alert(`E-mail enviado para ${aluno.email}`);
  }

  opcoes: string[] = [
    "Gato", "Cachorro", "Pombo"
  ]

  opcaoSelecionada: string = 'nenhum';

}
