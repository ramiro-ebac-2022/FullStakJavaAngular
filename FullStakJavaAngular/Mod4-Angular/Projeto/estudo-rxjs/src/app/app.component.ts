import { Component, OnDestroy, OnInit } from '@angular/core';
import { GeolocationService } from './services/geolocation.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit, OnDestroy {
  title = 'estudo-rxjs';
  mostrarRelogio: boolean = true;

  alternarRelogio() {
    this.mostrarRelogio = !this.mostrarRelogio;
  }

  //------
  // injetando o geolocation
  coordenadas?: GeolocationCoordinates;
  inscricao?: Subscription;

  constructor(private geolocation: GeolocationService) {
  }

  ngOnDestroy(): void {
    this.inscricao?.unsubscribe();
  }

  ngOnInit(): void {
    this.inscricao = this.geolocation.positionObservable().subscribe( {
      next: (coords) => {
        this.coordenadas = coords;
      }, 
      error: (error) => {
        alert(error.message);
      }
    } );
  }

}