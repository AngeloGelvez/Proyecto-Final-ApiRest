package com.proyecto.demo.controllers;

import com.proyecto.demo.repositories.entity.ClienteEntity;
import com.proyecto.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    public List<ClienteEntity> mostrarTodos() {
        return clienteService.findAll();
    }

    @PostMapping("/")
    public void crearCliente(@RequestBody ClienteEntity cliente) {
        clienteService.save(cliente);
    }

    @PutMapping("/{id}")
    public ClienteEntity actualizar(@PathVariable Long id, @RequestBody ClienteEntity cliente) {
        return clienteService.update(id, cliente);
    }
}
