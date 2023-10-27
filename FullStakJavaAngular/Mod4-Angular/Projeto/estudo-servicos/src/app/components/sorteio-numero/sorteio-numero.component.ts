import { Component } from '@angular/core';
import { RandomService } from 'src/app/services/random.service';

@Component({
  selector: 'app-sorteio-numero',
  templateUrl: './sorteio-numero.component.html',
  styleUrls: ['./sorteio-numero.component.css']
})
export class SorteioNumeroComponent {
  //injeção dependencia
  constructor(private randomService: RandomService) {}
  
  gerarNumero() {
    //exemplo, gera numero na faixa 0 - 99
    const numero = this.randomService.geraNumero(100);
    alert(`O número gerado foi : ${numero}`);
  }
}
