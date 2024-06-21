package com.proyecto.demo.controllers;

import com.proyecto.demo.repositories.entity.ClienteEntity;
import com.proyecto.demo.repositories.entity.InmuebleEntity;
import com.proyecto.demo.repositories.entity.VisitaEntity;
import com.proyecto.demo.services.ClienteService;
import com.proyecto.demo.services.InmuebleService;
import com.proyecto.demo.services.VisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visita")
public class VisitaController {

    @Autowired
    private VisitaService visitaService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private InmuebleService inmuebleService;

    @GetMapping("/")
    public List<VisitaEntity> mostrarTodo() {
        return visitaService.findAll();
    }

    @PostMapping("/{idCliente}/{idInmueble}")
    public void registrarVisita(@PathVariable Long idCliente, @PathVariable Long idInmueble, @RequestBody VisitaEntity visita) {
        ClienteEntity cliente = clienteService.findById(idCliente);
        InmuebleEntity inmueble = inmuebleService.findById(idInmueble);

        visita.setCliente(cliente);
        visita.setInmueble(inmueble);

        visitaService.save(visita);
    }
}
