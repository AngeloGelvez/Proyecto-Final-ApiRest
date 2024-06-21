package com.proyecto.demo.repositories;

import com.proyecto.demo.repositories.entity.OfertaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfertaRepository extends CrudRepository<OfertaEntity, Long> {
}
