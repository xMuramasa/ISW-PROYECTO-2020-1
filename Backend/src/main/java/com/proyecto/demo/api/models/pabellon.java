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

    @Column(name="personalId")
    int personalId;

    public pabellon(){
        
    }

    public pabellon(int id, int pabellonId, int personalId) {
        this.id = id;
        this.pabellonId = pabellonId;
        this.personalId = personalId;
        
    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getpabellonId() {
        return this.pabellonId;
    }

    public void setpabellonId(int pabellonId) {
        this.pabellonId = pabellonId;
    }

    public int getpersonalId(){
        return this.personalId;
    }
    public void setpersonalId(int personalId){
        this.personalId = personalId;
    } 

}