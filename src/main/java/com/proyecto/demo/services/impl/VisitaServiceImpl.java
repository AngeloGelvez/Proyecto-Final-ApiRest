package com.proyecto.demo.services.impl;

import com.proyecto.demo.repositories.VisitaRepository;
import com.proyecto.demo.repositories.entity.PropietarioEntity;
import com.proyecto.demo.repositories.entity.VisitaEntity;
import com.proyecto.demo.services.VisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitaServiceImpl implements VisitaService {

    @Autowired
    private VisitaRepository visitaRepository;

    @Override
    public List<VisitaEntity> findAll() {
        return (List<VisitaEntity>) visitaRepository.findAll();
    }

    @Override
    public VisitaEntity findById(Long id) {
        if(visitaRepository.findById(id).isPresent()) {
            return visitaRepository.findById(id).get();
        }

        return null;
    }

    @Override
    public void save(VisitaEntity visita) {
        visitaRepository.save(visita);
    }

    @Override
    public VisitaEntity update(Long id, VisitaEntity visita) {
        VisitaEntity c = findById(id);

        if(c != null) {
            c.setComentario(visita.getComentario());

            visitaRepository.save(c);
            return c;
        }

        return null;
    }

    @Override
    public void deleteById(Long id) {
        visitaRepository.deleteById(id);
    }
}
