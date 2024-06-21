package com.proyecto.demo.controllers;

import com.proyecto.demo.repositories.entity.OficinaEntity;
import com.proyecto.demo.services.OficinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/oficina")
public class OficinaController {

    @Autowired
    private OficinaService oficinaService;

    @GetMapping("/")
    public List<OficinaEntity> oficina() {
        return oficinaService.findAll();
    }

    @PostMapping("/")
    public void crear(@RequestBody OficinaEntity oficina) {
        oficinaService.save(oficina);
    }

    @PutMapping("/{id}")
    public OficinaEntity actualizar(@PathVariable Long id, @RequestBody OficinaEntity oficina) {
        return oficinaService.update(id, oficina);
    }

    @DeleteMapping("/{id}")
    public void actualizar(@PathVariable Long id) {
        oficinaService.deleteById(id);
    }
}
