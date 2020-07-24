package com.proyecto.demo.api.repositories;

import java.io.Serializable;
import java.util.List;

import com.proyecto.demo.api.models.recuperacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoryrecuperacion")
public interface recuperacionRepository extends JpaRepository<recuperacion, Serializable> {

    public abstract recuperacion findByrecuperacionId(int recuperacionId);

    public abstract recuperacion findBypersonalId(int personalId);

    public abstract List<recuperacion> findAllByrecuperacionId(int recuperacionId);

}