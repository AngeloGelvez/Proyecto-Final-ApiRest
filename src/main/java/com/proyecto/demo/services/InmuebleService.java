package com.proyecto.demo.services;

import com.proyecto.demo.repositories.entity.InmuebleEntity;

import java.util.List;

public interface InmuebleService {

    List<InmuebleEntity> findAll();

    InmuebleEntity findById(Long id);

    void save(InmuebleEntity inmueble);

    InmuebleEntity update(Long id, InmuebleEntity inmueble);

    void deleteById(Long id);
}
