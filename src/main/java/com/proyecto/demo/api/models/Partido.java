package com.proyecto.demo.api.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="Partido")
@Entity
public class Partido{
    @Id
    @GenericGenerator(name="incrementpartido", strategy="increment")
    @GeneratedValue(generator="incrementpartido")
    @Column(name="id_partido")
    long id;

    @Column(name="id_torneo")
    long idtorneo;

    @ManyToOne
    @JoinColumn(name = "id_equipoA", nullable = true)
    private Equipo equipoA;

    @ManyToOne
    @JoinColumn(name = "id_equipoB", nullable = true)
    private Equipo equipoB;

    @Column(name="scoreA")
    long scoreA;

    @Column(name="scoreB")
    long scoreB;

    Partido (){

    }

    public Partido(long id, long idtorneo, Equipo equipoA, Equipo equipoB, long scoreA, long scoreB) {
        this.id = id;
        this.idtorneo = idtorneo;
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdtorneo() {
        return this.idtorneo;
    }

    public void setIdtorneo(long idtorneo) {
        this.idtorneo = idtorneo;
    }

    public Equipo getEquipoA() {
        return this.equipoA;
    }

    public void setEquipoA(Equipo equipoA) {
        this.equipoA = equipoA;
    }

    public Equipo getEquipoB() {
        return this.equipoB;
    }

    public void setEquipoB(Equipo equipoB) {
        this.equipoB = equipoB;
    }

    public long getScoreA() {
        return this.scoreA;
    }

    public void setScoreA(long scoreA) {
        this.scoreA = scoreA;
    }

    public long getScoreB() {
        return this.scoreB;
    }

    public void setScoreB(long scoreB) {
        this.scoreB = scoreB;
    }

}