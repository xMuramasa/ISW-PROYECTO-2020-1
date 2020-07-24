package com.proyecto.demo.api.repositories;

import java.io.Serializable;
import java.util.List;

import com.proyecto.demo.api.models.pabellon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorypabellon")
public interface pabellonRepository extends JpaRepository<pabellon, Serializable> {

    public abstract pabellon findBypabellonId(int pabellonId);

    public abstract pabellon findBypersonalId(int personalId);

    public abstract List<pabellon> findAllBypabellonId(int pabellonId);

}