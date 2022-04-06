package io.murilo.vendas.controller;

import io.murilo.vendas.model.Entity.Cliente;
import io.murilo.vendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Integer id) {
        Optional<Cliente> byId = repository.findById(id);
        return new ResponseEntity<>(byId.get(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> putCliente(@PathVariable Integer id, @RequestBody @Valid Cliente cliente) {
        Optional<Cliente> clienteAtualizado = repository.findById(id)
                .map(atual -> {
                    cliente.setId(atual.getId());
                    repository.save(cliente);
                    return atual;
                });

        return new ResponseEntity<>(clienteAtualizado.get(), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Cliente>> getAll() {
        List<Cliente> all = repository.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Cliente> postCliente(@RequestBody @Valid Cliente cliente) {
        Cliente saved = repository.save(cliente);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Integer id) {
        repository.findById(id)
                .map(cliente -> {
                    repository.delete(cliente);
                    return Void.TYPE;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado na base de dados"));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
