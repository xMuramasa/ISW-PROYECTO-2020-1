package com.proyecto.demo.api.repositories;

import java.io.Serializable;
import java.util.List;

import com.proyecto.demo.api.models.recuperacion;
import com.proyecto.demo.api.models.medico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoryrecuperacion")
public interface recuperacionRepository extends JpaRepository<recuperacion, Serializable> {

    public abstract recuperacion findByIdrecuperacion(long id_recuperacion);

    public abstract List<medico> findByrecuperacion(long id_recuperacion);

}