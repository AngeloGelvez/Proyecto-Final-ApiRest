package com.proyecto.demo.services;

import com.proyecto.demo.repositories.entity.ClienteEntity;

import java.util.List;

public interface ClienteService {

    List<ClienteEntity> findAll();

    ClienteEntity findById(Long id);

    void save(ClienteEntity cliente);

    ClienteEntity update(Long id, ClienteEntity cliente);

    void deleteById(Long id);
}
