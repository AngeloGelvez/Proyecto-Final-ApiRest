package com.proyecto.demo.repositories.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "caracteristicas")
public class CaracteristicaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int magnitud;
    private int pisos;
    private int habitaciones;
    private int banos;
    private int cocinas;
}
