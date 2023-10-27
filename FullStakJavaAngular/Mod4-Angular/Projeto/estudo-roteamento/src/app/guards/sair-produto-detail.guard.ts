import { ActivatedRouteSnapshot, CanDeactivate, CanDeactivateFn, RouterStateSnapshot, UrlTree } from '@angular/router';
import { ProdutoDetailComponent } from '../components/produto-detail/produto-detail.component';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'  
})

export class SairProdutoDetailGuard implements CanDeactivate<ProdutoDetailComponent> {
  canDeactivate(
    component: ProdutoDetailComponent, 
    currentRoute: ActivatedRouteSnapshot, 
    currentState: RouterStateSnapshot, 
    nextState: RouterStateSnapshot
    ): 
      | boolean 
      | UrlTree 
      | Observable<boolean | UrlTree> 
      | Promise<boolean | UrlTree> {
    if (!component.pressionouFechar) {
      component.aviso();
    }

    return component.pressionouFechar;
  }
  
}