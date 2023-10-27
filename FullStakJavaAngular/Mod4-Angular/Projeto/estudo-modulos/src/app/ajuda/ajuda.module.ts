import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AjudaRoutingModule } from './ajuda-routing.module';
import { MaterialModule } from '../shared/material/material.module';
import { FaqComponent } from './components/faq/faq.component';


@NgModule({
  declarations: [
    FaqComponent
  ],
  imports: [
    CommonModule,
    AjudaRoutingModule,
    MaterialModule
  ]
})
export class AjudaModule { }
