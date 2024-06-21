package com.proyecto.demo.repositories.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "clientes")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
