package com.proyecto.demo.repositories;

import com.proyecto.demo.repositories.entity.InmuebleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InmuebleRepository extends CrudRepository<InmuebleEntity, Long> {
}
