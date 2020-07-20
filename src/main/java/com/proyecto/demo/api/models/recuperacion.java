package com.proyecto.demo.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "Recuperacion")
@Entity
public class recuperacion {
    @Id
    @GenericGenerator(name = "incrementrelpab", strategy = "increment")
    @GeneratedValue(generator = "incrementrelpab")
    @Column(name = "id")
    int id;

    @Column(name = "recuperacionId")
    int recuperacionId;

    @Column(name = "medicoId")
    int medicoId;

    public recuperacion() {

    }

    public recuperacion(int id, int recuperacionId, int medicoId) {
        this.id = id;
        this.recuperacionId = recuperacionId;
        this.medicoId = medicoId;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIrecuperacionId() {
        return this.recuperacionId;
    }

    public void setrecuperacionId(int recuperacionId) {
        this.recuperacionId = recuperacionId;
    }

    public int getMedicoId() {
        return this.medicoId;
    }

    public void setMedico(int medicoId) {
        this.medicoId = medicoId;
    }

}