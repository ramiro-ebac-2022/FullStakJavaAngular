import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class LoginService {
  private email: string = 'usuario@email.com';
  private senha: string = '12345';
  logado: boolean = false;

  login(email: string , senha: string): boolean {
    if (this.email == email && this.senha == senha) {
      this.logado = true;
    } else {
      this.logado = false;
    }
    return this.logado;
  }
}
