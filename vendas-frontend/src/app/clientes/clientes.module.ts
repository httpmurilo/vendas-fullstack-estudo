import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ClientesComponent } from './clientes.component';
import { ClientesFormComponent } from './clientes-form/clientes-form.component';
import { ClientesRoutingModule } from './clientes-routing.module';

@NgModule({
  imports: [
    CommonModule,
    ClientesRoutingModule
  ],
  declarations: [ClientesComponent, ClientesFormComponent], 
  exports: [
    ClientesComponent,
    ClientesFormComponent
  ]
})
export class ClientesModule { }
