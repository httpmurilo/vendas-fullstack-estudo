import { Component, OnInit } from '@angular/core';
import { Cliente} from '../cliente'
import { ClientesService } from 'src/app/services/clientes.service';

@Component({
  selector: 'app-clientes-form',
  templateUrl: './clientes-form.component.html',
  styleUrls: ['./clientes-form.component.css']
})
export class ClientesFormComponent implements OnInit {

  cliente: Cliente;
  sucess: boolean = false;
  errors: String[];

  constructor(private service: ClientesService) {
    this.cliente = new Cliente();
    }

  ngOnInit() {
  }

  onSubmit(){
    this.service.postCliente(this.cliente).subscribe(response => {
        this.sucess = true;
      })
  }

}
