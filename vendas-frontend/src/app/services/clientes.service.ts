import { Injectable } from '@angular/core';
import { Cliente } from '../clientes/cliente';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { AppSettings } from '../const/AppSettings';

@Injectable()
export class ClientesService {

constructor(private http: HttpClient) {
 }

getCliente() : Cliente {
     return null;
}

postCliente(cliente: Cliente) : Observable<Cliente> {
     return this.http.post<Cliente>(AppSettings.API_CLIENTE_ENDPOINT, cliente)
}

}
