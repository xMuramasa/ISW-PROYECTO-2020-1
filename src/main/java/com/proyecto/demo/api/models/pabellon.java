package com.proyecto.demo.api.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

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

    @OneToMany(mappedBy = "medicoId")
    private Set<medico> medico;

    public pabellon(){
        
    }

    public pabellon(int id, int pabellonId, Set<medico> medico) {
        this.id = id;
        this.pabellonId = pabellonId;
        this.medico = medico;
        
    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPabellon() {
        return this.pabellonId;
    }

    public void setIdPabellon(int pabellonId) {
        this.pabellonId = pabellonId;
    }

    public Set<medico> getMedico(){
        return this.medico;
    }
    public void setMedico(Set<medico> medico){
        this.medico = medico;
    } 

}