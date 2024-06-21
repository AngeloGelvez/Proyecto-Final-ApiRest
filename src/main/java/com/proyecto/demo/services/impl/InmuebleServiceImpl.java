package com.proyecto.demo.services.impl;

import com.proyecto.demo.repositories.InmuebleRepository;
import com.proyecto.demo.repositories.entity.CaracteristicaEntity;
import com.proyecto.demo.repositories.entity.InmuebleEntity;
import com.proyecto.demo.services.InmuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InmuebleServiceImpl implements InmuebleService {

    @Autowired
    private InmuebleRepository inmuebleRepository;

    @Override
    public List<InmuebleEntity> findAll() {
        return (List<InmuebleEntity>) inmuebleRepository.findAll();
    }

    @Override
    public InmuebleEntity findById(Long id) {
        if(inmuebleRepository.findById(id).isPresent()) {
            return inmuebleRepository.findById(id).get();
        }

        return null;
    }

    @Override
    public void save(InmuebleEntity inmueble) {
        inmuebleRepository.save(inmueble);
    }

    @Override
    public InmuebleEntity update(Long id, InmuebleEntity inmueble) {
        InmuebleEntity c = findById(id);

        if(c != null) {
            c.setDireccion((inmueble.getDireccion() == null)? c.getDireccion(): inmueble.getDireccion());
            c.setCiudad((inmueble.getCiudad() == null)? c.getCiudad(): inmueble.getCiudad());
            c.setNumReferencia((inmueble.getNumReferencia() == null)? c.getNumReferencia(): inmueble.getNumReferencia());
            c.setSuperficie((inmueble.getSuperficie() == null)? c.getSuperficie(): inmueble.getSuperficie());
            c.setPrecio((inmueble.getPrecio() == null)? c.getPrecio(): inmueble.getPrecio());

            inmuebleRepository.save(c);
            return c;
        }

        return null;
    }

    @Override
    public void deleteById(Long id) {
        inmuebleRepository.deleteById(id);
    }
}
