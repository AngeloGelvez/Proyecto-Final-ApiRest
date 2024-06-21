package com.proyecto.demo.repositories.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "oficinas")
public class OficinaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private  String ubicacion;
    private String ciudad;
    private String telefono;

    @OneToMany(mappedBy = "oficina", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InmuebleEntity> listaInmuebles;
}
