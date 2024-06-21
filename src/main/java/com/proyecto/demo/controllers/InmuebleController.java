package com.proyecto.demo.controllers;

import com.proyecto.demo.repositories.entity.*;
import com.proyecto.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inmueble")
public class InmuebleController {

    @Autowired
    private InmuebleService inmuebleService;

    @Autowired
    private PropietarioService propietarioService;

    @Autowired
    private OfertaService ofertaService;

    @Autowired
    private CaracteristicaService caracteristicaService;

    @Autowired
    private OficinaService oficinaService;

    @GetMapping("/")
    public List<InmuebleEntity> mostrarTodo() {
        return inmuebleService.findAll();
    }

    @PostMapping("/{idProp}/{idOferta}/{idCaract}/{idOficina}")
    public void crear(@PathVariable Long idProp, @PathVariable Long idOferta, @PathVariable Long idCaract, @PathVariable Long idOficina, @RequestBody InmuebleEntity inmueble) {
        PropietarioEntity prop = propietarioService.findById(idProp);
        OfertaEntity ofer = ofertaService.findById(idOferta);
        CaracteristicaEntity caract = caracteristicaService.findById(idCaract);
        OficinaEntity ofi = oficinaService.findById(idOferta);

        inmueble.setOferta(ofer);
        inmueble.setPropietario(prop);
        inmueble.setCaract(caract);
        inmueble.setOficina(ofi);

        inmuebleService.save(inmueble);
    }

    @GetMapping("/{id}")
    public InmuebleEntity buscarPorId(@PathVariable Long id) {
        return inmuebleService.findById(id);
    }
}
