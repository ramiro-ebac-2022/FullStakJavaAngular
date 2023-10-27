import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class GeolocationService {
  positionObservable(): Observable<GeolocationCoordinates> { 
    return new Observable( (subscriber) => {
      const {geolocation} = navigator;
      let watchId: number;

      if (geolocation) {
        watchId = geolocation.watchPosition( (pos) => {
          subscriber.next(pos.coords);
        } , (erro) => {
          subscriber.error(erro);
        });
      } else {
        subscriber.error(new Error("Geolocation não encontrado"));
      }

      return () => {
        geolocation.clearWatch(watchId);
      }
    } );
  }
}
