package com.proyecto.demo.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "quimioterapia")
@Entity
public class quimioterapia {
    @Id
    @GenericGenerator(name = "incrementrelquimio", strategy = "increment")
    @GeneratedValue(generator = "incrementrelquimio")
    @Column(name = "id")
    int id;

    @Column(name = "quimioterapiaId")
    int quimioterapiaId;

    @Column(name = "personalId")
    int personalId;

    public quimioterapia() {

    }

    public quimioterapia(int id, int quimioterapiaId, int personalId) {
        this.id = id;
        this.quimioterapiaId = quimioterapiaId;
        this.personalId = personalId;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getquimioterapiaId() {
        return this.quimioterapiaId;
    }

    public void setquimioterapiaId(int quimioterapiaId) {
        this.quimioterapiaId = quimioterapiaId;
    }

    public int getpersonalId() {
        return this.personalId;
    }

    public void setpersonalId(int personalId) {
        this.personalId = personalId;
    }

}