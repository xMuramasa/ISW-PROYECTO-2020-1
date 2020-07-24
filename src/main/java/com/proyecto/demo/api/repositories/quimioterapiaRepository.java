package com.proyecto.demo.api.repositories;

import java.io.Serializable;
import java.util.List;

import com.proyecto.demo.api.models.quimioterapia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoryquimioterapia")
public interface quimioterapiaRepository extends JpaRepository<quimioterapia, Serializable> {

    public abstract quimioterapia findByquimioterapiaId(int quimioterapiaId);
    
    public abstract quimioterapia findBypersonalId(int personalId);

    public abstract List<quimioterapia> findAllByquimioterapiaId(int quimioterapiaId);

}