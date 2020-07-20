package com.proyecto.demo.api.services;

import java.util.List;

import com.proyecto.demo.api.models.quimioterapia;
import com.proyecto.demo.api.models.medico;
import com.proyecto.demo.api.repositories.quimioterapiaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicequimioterapia")
public class quimioterapiaService {

    @Autowired
    @Qualifier("repositoryquimioterapia")
    private quimioterapiaRepository repositorio;

    public boolean crear(quimioterapia quimioterapia) {
        try {
            repositorio.save(quimioterapia);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean actualizar(quimioterapia quimioterapia) {
        try {
            repositorio.save(quimioterapia);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrar(long id) {
        try {
            quimioterapia quimioterapia = repositorio.findByIdquimioterapia(id);
            repositorio.delete(quimioterapia);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public quimioterapia obtenerporId(long id) {
        return repositorio.findByIdquimioterapia(id);
    }

    public List<medico> obtenerByquimioterapia(long id) {
        return repositorio.findByquimioterapia(id);
    }
}