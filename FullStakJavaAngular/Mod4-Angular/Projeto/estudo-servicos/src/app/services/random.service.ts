import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RandomService {
  //gera um número de 0 ate max
  geraNumero(max: number): number {
    return Math.floor(Math.random() * max);
  }
}
