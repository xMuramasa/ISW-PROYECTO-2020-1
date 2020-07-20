package com.proyecto.demo.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "Pabellon")
@Entity
public class quimioterapia {
    @Id
    @GenericGenerator(name = "incrementrelpab", strategy = "increment")
    @GeneratedValue(generator = "incrementrelpab")
    @Column(name = "id")
    int id;

    @Column(name = "quimioterapiaId")
    int quimioterapiaId;

    @Column(name = "medicoId")
    int medicoId;

    public quimioterapia() {

    }

    public quimioterapia(int id, int quimioterapiaId, int medicoId) {
        this.id = id;
        this.quimioterapiaId = quimioterapiaId;
        this.medicoId = medicoId;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIquimioterapiaId() {
        return this.quimioterapiaId;
    }

    public void setquimioterapiaId(int quimioterapiaId) {
        this.quimioterapiaId = quimioterapiaId;
    }

    public int getmedicoId() {
        return this.medicoId;
    }

    public void setmedicoId(int medicoId) {
        this.medicoId = medicoId;
    }

}