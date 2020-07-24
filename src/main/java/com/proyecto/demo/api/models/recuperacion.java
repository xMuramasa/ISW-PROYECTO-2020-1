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

    @Column(name = "personalId")
    int personalId;

    public recuperacion() {

    }

    public recuperacion(int id, int recuperacionId, int personalId) {
        this.id = id;
        this.recuperacionId = recuperacionId;
        this.personalId = personalId;

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

    public int getpersonalId() {
        return this.personalId;
    }

    public void setpersonal(int personalId) {
        this.personalId = personalId;
    }

}