package com.proyecto.demo.services;

import com.proyecto.demo.repositories.entity.OficinaEntity;

import java.util.List;

public interface OficinaService {

    List<OficinaEntity> findAll();

    OficinaEntity findById(Long id);

    void save(OficinaEntity oficina);

    OficinaEntity update(Long id, OficinaEntity oficina);

    void deleteById(Long id);
}
