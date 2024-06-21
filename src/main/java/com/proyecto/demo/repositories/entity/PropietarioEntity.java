package com.proyecto.demo.repositories.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "propietarios")
public class PropietarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String ciudad;
    private String pais;

    @OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InmuebleEntity> listaInmuebles;
}
