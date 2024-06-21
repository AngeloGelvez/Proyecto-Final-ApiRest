package com.proyecto.demo.services.impl;

import com.proyecto.demo.repositories.CaracteristicaRepository;
import com.proyecto.demo.repositories.entity.CaracteristicaEntity;
import com.proyecto.demo.repositories.entity.ClienteEntity;
import com.proyecto.demo.services.CaracteristicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaracteristicaServiceImpl implements CaracteristicaService {

    @Autowired
    private CaracteristicaRepository caracteristicaRepository;

    @Override
    public List<CaracteristicaEntity> findAll() {
        return (List<CaracteristicaEntity>) caracteristicaRepository.findAll();
    }

    @Override
    public CaracteristicaEntity findById(Long id) {
        if(caracteristicaRepository.findById(id).isPresent()) {
            return caracteristicaRepository.findById(id).get();
        }

        return null;
    }

    @Override
    public void save(CaracteristicaEntity caract) {
        caracteristicaRepository.save(caract);
    }

    @Override
    public CaracteristicaEntity update(Long id, CaracteristicaEntity caract) {
        CaracteristicaEntity c = findById(id);

        if(c != null) {
            c.setPisos(caract.getPisos());
            c.setBanos(caract.getBanos());
            c.setCocinas(caract.getCocinas());
            c.setHabitaciones(caract.getHabitaciones());
            c.setMagnitud(caract.getMagnitud());

            caracteristicaRepository.save(c);
            return c;
        }

        return null;
    }

    @Override
    public void deleteById(Long id) {
        caracteristicaRepository.deleteById(id);
    }
}
