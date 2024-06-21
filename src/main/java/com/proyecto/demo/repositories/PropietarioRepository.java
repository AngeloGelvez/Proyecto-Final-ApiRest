package com.proyecto.demo.repositories;

import com.proyecto.demo.repositories.entity.PropietarioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietarioRepository extends CrudRepository<PropietarioEntity, Long> {
}
