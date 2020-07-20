package com.proyecto.demo.api.repositories;

import java.io.Serializable;
import java.util.List;

import com.proyecto.demo.api.models.pabellon;
import com.proyecto.demo.api.models.medico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorypabellon")
public interface pabellonRepository extends JpaRepository<pabellon, Serializable> {

    public abstract pabellon findByIdPabellon(long id_pabellon);

    public abstract List<medico> findByPabellon(long id_pabellon);

}