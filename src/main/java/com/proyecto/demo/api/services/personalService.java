package com.proyecto.demo.api.services;

import java.util.List;

import com.proyecto.demo.api.models.personal;
import com.proyecto.demo.api.repositories.personalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicepersonal")
public class personalService{
    @Autowired
    @Qualifier("repositorypersonal")
    private personalRepository repositorio;

    public boolean crear(personal personal){
        try{
            repositorio.save(personal);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(personal personal){
        try{
            repositorio.save(personal);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(int id){
        try{
            personal personal = repositorio.findBypersonalId(id);
            repositorio.delete(personal);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public personal obtenerporId(int personalId){
        return repositorio.findBypersonalId(personalId);
    }

    public List<personal> obtenerAll(){
        return repositorio.findAll();
    }

}