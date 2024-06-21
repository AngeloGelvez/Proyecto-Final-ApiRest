package com.proyecto.demo.services.impl;

import com.proyecto.demo.repositories.OficinaRepository;
import com.proyecto.demo.repositories.entity.CaracteristicaEntity;
import com.proyecto.demo.repositories.entity.OficinaEntity;
import com.proyecto.demo.services.OficinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OficinaServiceImpl implements OficinaService {

    @Autowired
    private OficinaRepository oficinaRepository;

    @Override
    public List<OficinaEntity> findAll() {
        return (List<OficinaEntity>) oficinaRepository.findAll();
    }

    @Override
    public OficinaEntity findById(Long id) {
        if(oficinaRepository.findById(id).isPresent()) {
            return oficinaRepository.findById(id).get();
        }

        return null;
    }

    @Override
    public void save(OficinaEntity oficina) {
        oficinaRepository.save(oficina);
    }

    @Override
    public OficinaEntity update(Long id, OficinaEntity oficina) {
        OficinaEntity c = findById(id);

        if(c != null) {
            c.setNombre(oficina.getNombre());
            c.setUbicacion(oficina.getUbicacion());
            c.setCiudad(oficina.getCiudad());
            c.setTelefono(oficina.getTelefono());

            oficinaRepository.save(c);
            return c;
        }

        return null;
    }

    @Override
    public void deleteById(Long id) {
        oficinaRepository.deleteById(id);
    }
}
