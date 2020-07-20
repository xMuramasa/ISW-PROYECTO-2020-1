package com.proyecto.demo.api.repositories;

import java.io.Serializable;
import java.util.List;

import com.proyecto.demo.api.models.quimioterapia;
import com.proyecto.demo.api.models.medico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoryquimioterapia")
public interface quimioterapiaRepository extends JpaRepository<quimioterapia, Serializable> {

    public abstract quimioterapia findByIdquimioterapia(long id_quimioterapia);

    public abstract List<medico> findByquimioterapia(long id_quimioterapia);

}