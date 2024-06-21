package com.proyecto.demo.services;

import com.proyecto.demo.repositories.entity.VisitaEntity;

import java.util.List;

public interface VisitaService {

    List<VisitaEntity> findAll();

    VisitaEntity findById(Long id);

    void save(VisitaEntity visita);

    VisitaEntity update(Long id, VisitaEntity visita);

    void deleteById(Long id);
}
