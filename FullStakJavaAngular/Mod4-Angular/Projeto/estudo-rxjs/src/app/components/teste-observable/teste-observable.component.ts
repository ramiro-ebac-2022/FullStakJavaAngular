import { Component } from '@angular/core';
import { Observable, Subscriber, filter, first, from, last, map, of, tap } from 'rxjs';

@Component({
  selector: 'app-teste-observable',
  templateUrl: './teste-observable.component.html',
  styleUrls: ['./teste-observable.component.css']
})
export class TesteObservableComponent {
  //construtor para poder chamar aos metodos
  constructor() {
    //this.testeObservable();
    //this.testeOperadoresCriacao();
    //this.testeOperadoresFiltragem();
    //this.testeOperadoresTransform();
    this.testeComposicao();
  }

  testeComposicao() {
    const obs = this.testeRandomNumbers(5);
    obs
      .pipe(
        tap( (num) => {
          console.log(`Numero original do Observable : ${num}`);
        }),
        map( (num) => num/2 ),
        filter( (num) => num>20 )
      )
      .subscribe({
      next: (valor) => {
        console.warn(`Valor aleatorio : ${valor}`);
      }
    })
  }

  testeRandomNumbers(total: number) : Observable<number> {
    return new Observable<number>( (subscriber) => {
      for(let i=0; i < total; i++) {
        const numero = Math.floor(Math.random() * 100);  //gera número de 0..99
        subscriber.next(numero);
      }
      subscriber.complete();
    });
  }

  testeOperadoresTransform() {
    const obs = from([10, 20, 30, 40]);

    obs.pipe(map( (num) => num+1 )).subscribe({
      next: (numero) => {
        console.warn(`Numero MAPEADO (num+1) : ${numero}`);
      }
    }); 

    obs.pipe(map( (num) => `Nro : [${num}]` )).subscribe({
      next: (texto) => {
        console.warn(`Numero MAPEADO (string) : ${texto}`);
      }
    }); 
  }

  testeOperadoresFiltragem() {
    const obs = from([10,30,20]);

    obs.pipe(first()).subscribe( {
      next: (num) => {
        console.warn(`Valor do FIRST : ${num}`);
      }
    });

    obs.pipe(last()).subscribe( {
      next: (num) => {
        console.warn(`Valor do LAST : ${num}`);
      }
    });

    obs.pipe(filter( (num) => num<30 )).subscribe( {
      next: (num) => {
        console.warn(`Valor do FILTER (num < 30) : ${num}`);
      }
    });
  }

  testeOperadoresCriacao() {
    const obs = from([10,30,20]);
    obs.subscribe( {
      next: (num) => {
        console.warn(`Número emitido pelo FROM : ${num}`);
      }
    });

    const obs2 = of(3,2,1);
    obs2.subscribe( {
      next: (num) => {
        console.warn(`Valor emitido pelo OF : ${num}`);
      }
    });
  }
  
  testeObservable() {
    const obs: Observable<number> = new Observable<number>( (subscriber) => {
      setTimeout( () => {
        subscriber.next(1);
        subscriber.next(3);
        subscriber.next(5);
        const numeroAleatorio = Math.floor(Math.random() * 100);
        if (numeroAleatorio % 2 == 0) {
          subscriber.error(`O numero ${numeroAleatorio} não é ímpar`);
        }
        subscriber.next(numeroAleatorio);
        subscriber.complete();
      } , 1500 );
    });
  
    obs.subscribe({
      next: (numero) => {
        console.warn(`Número emitido : ${numero}`);
      },
      complete: () => {
        console.warn('O Observable finalizou!');
      },
      error: (err) => {
        console.warn(`A mensagem foi : ${err}.`);
      }
    });

    console.log('HOLA !');
  }
}
