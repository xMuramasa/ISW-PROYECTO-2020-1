package com.proyecto.demo.api.services;

import java.util.List;

import com.proyecto.demo.api.models.recuperacion;
import com.proyecto.demo.api.repositories.recuperacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicerecuperacion")
public class recuperacionService {

    @Autowired
    @Qualifier("repositoryrecuperacion")
    private recuperacionRepository repositorio;

    public recuperacion crear(recuperacion recuperacion) {
        try {
            repositorio.save(recuperacion);
            return recuperacion;
        } catch (Exception e) {
            System.out.println("No se pudo agregar recuperacion");
            return recuperacion;
        }
    }

    public recuperacion actualizar(recuperacion recuperacion) {
        try {
            repositorio.save(recuperacion);
            return recuperacion;
        } catch (Exception e) {
                System.out.println("No se pudo actualizar recuperacion");
            return recuperacion;
        }
    }

    public boolean borrar(int personalId){
        try{
            recuperacion recuperacion = repositorio.findBypersonalId(personalId);
            repositorio.delete(recuperacion);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public recuperacion obtenerporId(int id) {
        return repositorio.findByrecuperacionId(id);
    }

    public List<recuperacion> obtenerByrecuperacionId(int id) {
        return repositorio.findAllByrecuperacionId(id);
    }
}