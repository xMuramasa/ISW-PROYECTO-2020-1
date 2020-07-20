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
    long id;

    @Column(name = "id_quimioterapia")
    long id_quimioterapia;

    @OneToMany(mappedBy = "id_medico")
    private Set<medico> medico;

    public quimioterapia() {

    }

    public quimioterapia(long id, long id_quimioterapia, Set<medico> medico) {
        this.id = id;
        this.id_quimioterapia = id_quimioterapia;
        this.medico = medico;

    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdquimioterapia() {
        return this.id_quimioterapia;
    }

    public void setIdquimioterapia(long id_quimioterapia) {
        this.id_quimioterapia = id_quimioterapia;
    }

    public Set<medico> getMedico() {
        return this.medico;
    }

    public void setMedico(Set<medico> medico) {
        this.medico = medico;
    }

}