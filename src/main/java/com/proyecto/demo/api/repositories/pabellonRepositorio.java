package com.proyecto.demo.api.repositories;

import java.io.Serializable;
import java.util.List;

import com.ayudantia.demo.api.models.pabellon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoriopabellon")
public interface pabellonRepositorio extends JpaRepository<pabellon, Serializable> {

    public abstract pabellon findByIdpabellon(long id_pabellon);

    public abstract List<medico> findByEquipo(long id_pabellon);

}