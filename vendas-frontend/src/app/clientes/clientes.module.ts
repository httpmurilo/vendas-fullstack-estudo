import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ClientesComponent } from './clientes.component';
import { ClientesFormComponent } from './clientes-form/clientes-form.component';
import { ClientesRoutingModule } from './clientes-routing.module';

import { FormsModule } from '@angular/forms'


@NgModule({
  imports: [
    CommonModule,
    ClientesRoutingModule,
    FormsModule
  ],
  declarations: [ClientesComponent, ClientesFormComponent], 
  exports: [
    ClientesComponent,
    ClientesFormComponent
  ]
})
export class ClientesModule { }
