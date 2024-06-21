package com.proyecto.demo.services.impl;

import com.proyecto.demo.repositories.ClienteRepository;
import com.proyecto.demo.repositories.entity.ClienteEntity;
import com.proyecto.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteEntity> findAll() {
        return (List<ClienteEntity>) clienteRepository.findAll();
    }

    @Override
    public ClienteEntity findById(Long id) {
        if(clienteRepository.findById(id).isPresent()) {
            return clienteRepository.findById(id).get();
        }

        return null;
    }

    @Override
    public void save(ClienteEntity cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public ClienteEntity update(Long id, ClienteEntity cliente) {
        ClienteEntity c = findById(id);

        if(c != null) {
            c.setNombre((cliente.getNombre() == null)? c.getNombre(): cliente.getNombre());
            c.setApellido((cliente.getApellido() == null)? c.getApellido(): cliente.getApellido());
            c.setEmail((cliente.getEmail() == null)? c.getEmail(): cliente.getEmail());
            c.setTelefono((cliente.getTelefono() == null)? c.getTelefono(): cliente.getTelefono());

            clienteRepository.save(c);
            return c;
        }

       return null;
    }

    @Override
    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }
}
