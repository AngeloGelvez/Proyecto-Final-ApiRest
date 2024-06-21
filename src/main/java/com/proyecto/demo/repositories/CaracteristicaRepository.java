package com.proyecto.demo.repositories;

import com.proyecto.demo.repositories.entity.CaracteristicaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaracteristicaRepository extends CrudRepository<CaracteristicaEntity, Long> {
}
