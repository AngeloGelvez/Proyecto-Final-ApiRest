package com.proyecto.demo.services.impl;

import com.proyecto.demo.repositories.PropietarioRepository;
import com.proyecto.demo.repositories.entity.OficinaEntity;
import com.proyecto.demo.repositories.entity.PropietarioEntity;
import com.proyecto.demo.services.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioServiceImpl implements PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepository;

    @Override
    public List<PropietarioEntity> findAll() {
        return (List<PropietarioEntity>) propietarioRepository.findAll();
    }

    @Override
    public PropietarioEntity findById(Long id) {
        if(propietarioRepository.findById(id).isPresent()) {
            return propietarioRepository.findById(id).get();
        }

        return null;
    }

    @Override
    public void save(PropietarioEntity prop) {
        propietarioRepository.save(prop);
    }

    @Override
    public PropietarioEntity update(Long id, PropietarioEntity prop) {
        PropietarioEntity c = findById(id);

        if(c != null) {
            c.setNombre(prop.getNombre());
            c.setApellido(prop.getApellido());
            c.setCorreo(prop.getCorreo());
            c.setCiudad(prop.getCiudad());
            c.setPais(prop.getPais());
            c.setTelefono(prop.getTelefono());

            propietarioRepository.save(c);
            return c;
        }

        return null;
    }

    @Override
    public void deleteById(Long id) {
        propietarioRepository.deleteById(id);
    }
}
