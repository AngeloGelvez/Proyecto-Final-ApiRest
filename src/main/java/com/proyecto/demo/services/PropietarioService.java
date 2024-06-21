package com.proyecto.demo.services;

import com.proyecto.demo.repositories.entity.PropietarioEntity;

import java.util.List;

public interface PropietarioService {

    List<PropietarioEntity> findAll();

    PropietarioEntity findById(Long id);

    void save(PropietarioEntity prop);

    PropietarioEntity update(Long id, PropietarioEntity prop);

    void deleteById(Long id);
}
