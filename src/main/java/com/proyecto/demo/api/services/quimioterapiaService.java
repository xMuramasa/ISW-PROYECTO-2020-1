package com.proyecto.demo.api.services;

import java.util.List;

import com.proyecto.demo.api.models.quimioterapia;
import com.proyecto.demo.api.repositories.quimioterapiaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicequimioterapia")
public class quimioterapiaService {

    @Autowired
    @Qualifier("repositoryquimioterapia")
    private quimioterapiaRepository repositorio;

    public quimioterapia crear(quimioterapia quimioterapia) {
        try {
            repositorio.save(quimioterapia);
            return quimioterapia;
        } catch (Exception e) {
            System.out.println("No se pudo ingresar quimioterapia");
            return quimioterapia;
        }
    }

    public quimioterapia actualizar(quimioterapia quimioterapia) {
        try {
            repositorio.save(quimioterapia);
            return quimioterapia;
        } catch (Exception e) {
            System.out.println("No se pudo actualizar quimioterapia");
            return quimioterapia;
        }
    }

    public boolean borrar(int personalId) {
        try {
            quimioterapia quimioterapia = repositorio.findBypersonalId(personalId);
            repositorio.delete(quimioterapia);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public quimioterapia obtenerporId(int id) {
        return repositorio.findByquimioterapiaId(id);
    }

    public List<quimioterapia> obtenerByquimioterapiaId(int id) {
        return repositorio.findAllByquimioterapiaId(id);
    }
}