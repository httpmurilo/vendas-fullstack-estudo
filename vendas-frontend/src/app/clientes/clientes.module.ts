import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ClientesComponent } from './clientes.component';
import { ClientesFormComponent } from './clientes-form/clientes-form.component';

@NgModule({
  imports: [
    CommonModule,
    ClientesRoutingModule
  ],
  declarations: [ClientesComponent, ClientesFormComponent], 
  exports: [
    ClientesComponent
  ]
})
export class ClientesModule { }
