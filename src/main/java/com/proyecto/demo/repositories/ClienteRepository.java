package com.proyecto.demo.repositories;

import com.proyecto.demo.repositories.entity.ClienteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteEntity, Long> {
}
