package com.proyecto.demo.api.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "Quimioterapia")
@Entity
public class quimioterapia {
    @Id
    @GenericGenerator(name = "incrementrelpab", strategy = "increment")
    @GeneratedValue(generator = "incrementrelpab")
    @Column(name = "id")
    int id;

    @Column(name = "quimioterapiaId")
    int quimioterapiaId;

    @OneToMany(mappedBy = "medicoId")
    private Set<medico> medico;

    public quimioterapia() {

    }

    public quimioterapia(int id, int quimioterapiaId, Set<medico> medico) {
        this.id = id;
        this.quimioterapiaId = quimioterapiaId;
        this.medico = medico;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdquimioterapia() {
        return this.quimioterapiaId;
    }

    public void setIdquimioterapia(int quimioterapiaId) {
        this.quimioterapiaId = quimioterapiaId;
    }

    public Set<medico> getMedico() {
        return this.medico;
    }

    public void setMedico(Set<medico> medico) {
        this.medico = medico;
    }

}