package com.proyecto.demo.api.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "recuperacion")
@Entity
public class recuperacion {
    @Id
    @GenericGenerator(name = "incrementrelpab", strategy = "increment")
    @GeneratedValue(generator = "incrementrelpab")
    @Column(name = "id")
    int id;

    @Column(name = "recuperacionId")
    int recuperacionId;

    @OneToMany(mappedBy = "medicoId")
    private Set<medico> medico;

    public recuperacion() {

    }

    public recuperacion(int id, int recuperacionId, Set<medico> medico) {
        this.id = id;
        this.recuperacionId = recuperacionId;
        this.medico = medico;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdrecuperacion() {
        return this.recuperacionId;
    }

    public void setIdrecuperacion(int recuperacionId) {
        this.recuperacionId = recuperacionId;
    }

    public Set<medico> getMedico() {
        return this.medico;
    }

    public void setMedico(Set<medico> medico) {
        this.medico = medico;
    }

}