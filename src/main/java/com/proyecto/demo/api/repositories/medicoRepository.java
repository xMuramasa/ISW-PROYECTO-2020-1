package com.proyecto.demo.api.repositories;

import java.io.Serializable;
import java.util.List;

import com.proyecto.demo.api.models.medico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorymedico")
public interface medicoRepository extends JpaRepository<medico, Serializable>{
    
    public abstract medico findBymedicoId(int medicoId);

    public abstract List<medico> findAll();

}