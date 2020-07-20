package com.proyecto.demo.api.repositories;

import java.io.Serializable;
import java.util.List;

import com.ayudantia.demo.HLTV.Modelos.Equipo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorioequipo")
public interface EquipoRepositorio extends JpaRepository<Equipo, Serializable>{
    
    public abstract Equipo findById(long id);

    public abstract List<Equipo> findAll();

}