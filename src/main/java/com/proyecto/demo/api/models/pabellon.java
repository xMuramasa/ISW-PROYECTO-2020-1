package com.proyecto.demo.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="Pabellon")
@Entity
public class pabellon{
    @Id
    @GenericGenerator(name="incrementrelpab", strategy="increment")
    @GeneratedValue(generator="incrementrelpab")
    @Column(name="id")
    int id;

    @Column(name="pabellonId")
    int pabellonId;

    @Column(name="medicoId")
    int medicoId;

    public pabellon(){
        
    }

    public pabellon(int id, int pabellonId, int medicoId) {
        this.id = id;
        this.pabellonId = pabellonId;
        this.medicoId = medicoId;
        
    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIpabellonId() {
        return this.pabellonId;
    }

    public void setpabellonId(int pabellonId) {
        this.pabellonId = pabellonId;
    }

    public int getmedicoId(){
        return this.medicoId;
    }
    public void setmedicoId(int medicoId){
        this.medicoId = medicoId;
    } 

}