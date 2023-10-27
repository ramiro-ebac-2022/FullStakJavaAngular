import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent {
  hoje: Date = new Date();
  valor: number = 0.7543;
  mensagem: string = "Olá mundo! A todos !";
  salario: number = 1500.649;

  valores: number[] = [1, 2, 3];
  numeroDigitado: string = '';

  inserirNumero() {
    if (this.numeroDigitado) {
      this.valores.push(Number(this.numeroDigitado));
    }
  }

  /* Exercício 1: 
     Criar um metodo que receba um e-mail
     e oculta parte do seu endereço : 
     amelia@gmail.com ==> a*****@gmail.com
     (ver no pipes/ocultar-email.pipe.ts)
  
     Exercício 2 : 
     Crie um pipe que receba um texto longo e quebra ele 
     numa quantidade de caracteres limite (argumento) :
     "Olá tudo bem com vocês?" ==> "Olá tudo bem" (12)
     (ver em pipes/limitar-texto)

     Exercicio 3
     Receber um array de números e devolver a soma : 
     [1, 2, 3, 4, 5]  ==> 15

  */

}
