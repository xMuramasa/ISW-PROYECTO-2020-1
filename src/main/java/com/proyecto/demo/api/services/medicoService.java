package com.proyecto.demo.api.services;

import java.util.List;

import com.proyecto.demo.api.models.medico;
import com.proyecto.demo.api.repositories.medicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicemedico")
public class medicoService{
    @Autowired
    @Qualifier("repositorymedico")
    private medicoRepository repositorio;

    public boolean crear(medico medico){
        try{
            repositorio.save(medico);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(medico medico){
        try{
            repositorio.save(medico);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(int id){
        try{
            medico medico = repositorio.findBymedicoId(id);
            repositorio.delete(medico);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public medico obtenerporId(int medicoId){
        return repositorio.findBymedicoId(medicoId);
    }

    public List<medico> obtenerAll(){
        return repositorio.findAll();
    }

}