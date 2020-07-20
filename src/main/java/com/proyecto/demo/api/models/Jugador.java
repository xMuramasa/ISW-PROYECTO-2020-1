package com.proyecto.demo.api.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="Jugador")
@Entity
public class Jugador{
    @Id
    @GenericGenerator(name="incrementjugador", strategy="increment")
    @GeneratedValue(generator="incrementjugador")
    @Column(name="id_jugador")
    long id;

    @Column(name="id_equipo")
    long equipo;

    @Column(name="nombre")
    String nombre;

    @Column(name="apellido")
    String apellido;

    @Column(name="apodo")
    String apodo;

    @Column(name="pais")
    String pais;

    @Column(name="nacimiento")
    Date nacimiento;

    public Jugador(){

    }

    public Jugador(long id, long equipo, String nombre, String apellido, String apodo, String pais, Date nacimiento) {
        this.id = id;
        this.equipo = equipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
        this.pais = pais;
        this.nacimiento = nacimiento;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEquipo() {
        return this.equipo;
    }

    public void setEquipo(long equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApodo() {
        return this.apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getNacimiento() {
        return this.nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }


}