package com.proyecto.demo.api.repositories;

import java.io.Serializable;
import java.util.List;

import com.ayudantia.demo.api.models.medico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoriomedico")
public interface medicoRepositorio extends JpaRepository<medico, Serializable>{
    
    public abstract medico findByIdMedico(long id_medico);

    public abstract List<medico> findAll();

}