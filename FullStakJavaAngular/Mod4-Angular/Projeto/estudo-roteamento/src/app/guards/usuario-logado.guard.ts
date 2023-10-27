import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, CanActivateFn, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { LoginService } from '../services/login.service';

@Injectable({
  providedIn: 'root'  
})

export class UsuarioLogadoGuard implements CanActivate {
  constructor(
    private loginService: LoginService,
    private router: Router
  ) {}
  
  canActivate(
    route: ActivatedRouteSnapshot, 
    state: RouterStateSnapshot
    ): 
      | boolean 
      | UrlTree 
      | Observable<boolean | UrlTree> 
      | Promise<boolean | UrlTree> {
    
      if(this.loginService.logado) {
        return true;
      } else {
        //caso informar credenciais inválidas, redireciona ao usuário para a pag. de login
        return this.router.parseUrl('/login');
      }
    }
}

/*
export const usuarioLogadoGuard: CanActivateFn = (route, state) => {
  return true;
};
*/

