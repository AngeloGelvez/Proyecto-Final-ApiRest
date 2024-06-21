package com.proyecto.demo.services.impl;

import com.proyecto.demo.repositories.OfertaRepository;
import com.proyecto.demo.repositories.entity.InmuebleEntity;
import com.proyecto.demo.repositories.entity.OfertaEntity;
import com.proyecto.demo.services.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfertaServiceImpl implements OfertaService {

    @Autowired
    private OfertaRepository ofertaRepository;

    @Override
    public List<OfertaEntity> findAll() {
        return (List<OfertaEntity>) ofertaRepository.findAll();
    }

    @Override
    public OfertaEntity findById(Long id) {
        if(ofertaRepository.findById(id).isPresent()) {
            return ofertaRepository.findById(id).get();
        }

        return null;
    }

    @Override
    public void save(OfertaEntity oferta) {
        ofertaRepository.save(oferta);
    }

    @Override
    public OfertaEntity update(Long id, OfertaEntity oferta) {
        OfertaEntity c = findById(id);

        if(c != null) {
            c.setEstado(oferta.getEstado());
            c.setCategoria((oferta.getCategoria() == null)? c.getCategoria() :oferta.getCategoria());
            c.setDescripcion((oferta.getDescripcion() == null)? c.getDescripcion() :oferta.getDescripcion());
            c.setPrecioMinimo(oferta.getPrecioMinimo());
            c.setPrecioMaximo(oferta.getPrecioMaximo());

            ofertaRepository.save(c);
            return c;
        }

        return null;
    }

    @Override
    public void deleteById(Long id) {
        ofertaRepository.deleteById(id);
    }
}
