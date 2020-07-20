package com.proyecto.demo.api.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="TORNEO")
@Entity
public class Torneo {
    @Id
    @GenericGenerator(name="incrementtorneo", strategy="increment")
    @GeneratedValue(generator="incrementtorneo") // se utiliza para evitar errores de id duplicadas
    @Column(name="id_torneo")
    private long id;

    @Column(name="nombre")
    String nombre;

    @Column(name="pais")
    String pais;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
        name = "participantes",
        joinColumns = { @JoinColumn(name="id_torneo")},
        inverseJoinColumns = { @JoinColumn(name="id_equipo")}
    )
    private Set<Equipo> equipos = new HashSet<>();

    public Torneo(){

    }

    public Torneo(long id, String nombre, String pais, Set<Equipo> equipos) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.equipos = equipos;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Set<Equipo> getEquipos() {
        return this.equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

}