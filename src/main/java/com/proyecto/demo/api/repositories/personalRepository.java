package com.proyecto.demo.api.repositories;

import java.io.Serializable;
import java.util.List;

import com.proyecto.demo.api.models.personal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorypersonal")
public interface personalRepository extends JpaRepository<personal, Serializable>{
    
    public abstract personal findBypersonalId(int personalId);

    public abstract List<personal> findAll();

}