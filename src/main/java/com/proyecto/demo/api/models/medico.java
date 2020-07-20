package com.proyecto.demo.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.proyecto.demo.api.models.pabellon;
import com.proyecto.demo.api.models.quimioterapia;
import com.proyecto.demo.api.models.recuperacion;

import org.hibernate.annotations.GenericGenerator;

@Table(name="MEDICO")
@Entity
public class medico{
    @Id
    @GenericGenerator(name="incrementmedico", strategy="increment")
    @GeneratedValue(generator="incrementmedico")
    @Column(name="id_medico")
    long id_medico;
    
    @Column(name="nombres")
    String nombres;

    @Column(name="apellidos")
    String apellidos;

    @Column(name="rut")
    String rut;

    @Column(name="numero")
    String numero;

    @Column(name="cargo")
    String cargo;
    
    @Column(name="correo")
    String correo;

    @Column(name="Ocupado")
    Boolean ocupado;

    @ManyToOne
    @JoinColumn(name="pabellon", nullable=false)
    pabellon pabellon;

    @ManyToOne
    @JoinColumn(name = "quimioterapia", nullable=false)
    quimioterapia quimioterapia;
    
    @ManyToOne
    @JoinColumn(name = "recuperacion", nullable=false)
    recuperacion recuperacion;


    public medico(){

    }

    public medico(long id, String nombres, String apellidos, String rut, String numero, String cargo, String correo, Boolean ocupado, pabellon pabellon, quimioterapia quimioterapia, recuperacion recuperacion) {
        this.id_medico = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rut = rut;
        this.numero = numero;
        this.cargo = cargo;
        this.correo = correo;
        this.ocupado = ocupado;

        this.recuperacion = recuperacion;        
        this.quimioterapia =quimioterapia;
        this.pabellon= pabellon;

    }

    public long getId() {
        return this.id_medico;
    }

    public void setId(long id) {
        this.id_medico = id;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCargo(){
        return this.cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public Boolean getOcupado(){
        return this.ocupado;
    }
    public void setOcupado(Boolean ocupado){
        this.ocupado = ocupado;
    }

    public void setrecupercion(recuperacion recuperacion) {
        this.recuperacion = recuperacion;
    }

    public recuperacion getRecuperacion() {
        return this.recuperacion;
    }

    public void setQumioterapia(quimioterapia quimioterapia) {
        this.quimioterapia = quimioterapia;
    }

    public quimioterapia getQumioterapia() {
        return this.quimioterapia;
    }

    public void setPabellon(pabellon pabellon) {
        this.pabellon = pabellon;
    }

    public pabellon getPabellon() {
        return this.pabellon;
    }

}