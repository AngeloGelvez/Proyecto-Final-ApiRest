package com.proyecto.demo.repositories.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "visitas")
public class VisitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fechaVisita;

    @Column(length = 400)
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name = "inmueble_id")
    @JsonIgnoreProperties("visitas")
    private InmuebleEntity inmueble;
}
