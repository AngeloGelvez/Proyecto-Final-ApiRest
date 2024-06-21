package com.proyecto.demo.repositories;

import com.proyecto.demo.repositories.entity.VisitaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitaRepository extends CrudRepository<VisitaEntity, Long> {
}
