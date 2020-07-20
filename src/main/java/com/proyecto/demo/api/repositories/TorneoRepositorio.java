package com.proyecto.demo.api.repositories;

import java.io.Serializable;
import java.util.List;

import com.ayudantia.demo.HLTV.Modelos.Torneo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoriotorneo")
public interface TorneoRepositorio extends JpaRepository<Torneo, Serializable>, PagingAndSortingRepository<Torneo, Serializable>{

    public abstract Torneo findById(long id);

    public abstract List<Torneo> findByPais(String pais);

    public abstract Page<Torneo> findAll(Pageable pageable);

}