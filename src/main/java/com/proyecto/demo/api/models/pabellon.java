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
    long id;

    @Column(name="id_pabellon")
    long id_pabellon;

    @OneToMany(mappedBy = "id_medico")
    private Set<medico> medico;

    public pabellon(){
        
    }

    public pabellon(long id, long id_pabellon, Set<medico> medico) {
        this.id = id;
        this.id_pabellon = id_pabellon;
        this.medico = medico;
        
    }
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdPabellon() {
        return this.id_pabellon;
    }

    public void setIdPabellon(long id_pabellon) {
        this.id_pabellon = id_pabellon;
    }

    public Set<medico> getMedico(){
        return this.medico;
    }
    public void setMedico(Set<medico> medico){
        this.medico = medico;
    } 

}