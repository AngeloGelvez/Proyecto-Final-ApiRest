package com.proyecto.demo.services;

import com.proyecto.demo.repositories.entity.CaracteristicaEntity;

import java.util.List;

public interface CaracteristicaService {

    List<CaracteristicaEntity> findAll();

    CaracteristicaEntity findById(Long id);

    void save(CaracteristicaEntity caract);

    CaracteristicaEntity update(Long id, CaracteristicaEntity caract);

    void deleteById(Long id);
}
