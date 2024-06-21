package com.proyecto.demo.services;

import com.proyecto.demo.repositories.entity.OfertaEntity;

import java.util.List;

public interface OfertaService {

    List<OfertaEntity> findAll();

    OfertaEntity findById(Long id);

    void save(OfertaEntity oferta);

    OfertaEntity update(Long id, OfertaEntity oferta);

    void deleteById(Long id);
}
