package com.proyecto.demo.repositories.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "inmuebles")
public class InmuebleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numReferencia;
    private Double superficie;
    private String direccion;
    private String ciudad;
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "propietario_id")
    @JsonIgnoreProperties("listaInmuebles")
    private PropietarioEntity propietario;

    @OneToMany(mappedBy = "inmueble", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VisitaEntity> visitas;

    @ManyToOne
    @JoinColumn(name = "oferta_id")
    private OfertaEntity oferta;

    @OneToOne
    @JoinColumn(name = "caract_id")
    private CaracteristicaEntity caract;

    @ManyToOne
    @JoinColumn(name = "oficina_id")
    @JsonIgnoreProperties("listaInmuebles")
    private OficinaEntity oficina;
}
