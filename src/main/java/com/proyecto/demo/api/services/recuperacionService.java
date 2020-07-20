package com.proyecto.demo.api.services;

import java.util.List;

import com.proyecto.demo.api.models.recuperacion;
import com.proyecto.demo.api.models.medico;
import com.proyecto.demo.api.repositories.recuperacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicerecuperacion")
public class recuperacionService {

    @Autowired
    @Qualifier("repositoryrecuperacion")
    private recuperacionRepository repositorio;

    public boolean crear(recuperacion recuperacion) {
        try {
            repositorio.save(recuperacion);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean actualizar(recuperacion recuperacion) {
        try {
            repositorio.save(recuperacion);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrar(int id) {
        try {
            recuperacion recuperacion = repositorio.findByrecuperacionId(id);
            repositorio.delete(recuperacion);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public recuperacion obtenerporId(int id) {
        return repositorio.findByrecuperacionId(id);
    }

    public List<medico> obtenerByrecuperacion(int id) {
        return repositorio.findAllByrecuperacionId(id);
    }
}