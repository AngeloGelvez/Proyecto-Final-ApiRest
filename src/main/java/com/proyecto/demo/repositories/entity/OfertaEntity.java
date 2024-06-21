package com.proyecto.demo.repositories.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "oferta")
public class OfertaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String estado;
    private Double precioMinimo;
    private Double precioMaximo;

    @Column(length = 400)
    private String descripcion;
    private String categoria;
}
