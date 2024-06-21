package com.proyecto.demo.repositories;

import com.proyecto.demo.repositories.entity.OficinaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OficinaRepository extends CrudRepository<OficinaEntity, Long> {
}
