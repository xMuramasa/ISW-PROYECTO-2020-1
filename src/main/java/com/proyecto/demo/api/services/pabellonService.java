package com.proyecto.demo.api.services;

import java.util.List;

import com.proyecto.demo.api.models.pabellon;
import com.proyecto.demo.api.models.medico;
import  com.proyecto.demo.api.repositories.pabellonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicepabellon")
public class pabellonService{

    @Autowired
    @Qualifier("repositorypabellon")
    private pabellonRepository repositorio;
    
    public boolean crear(pabellon pabellon){
        try{
            repositorio.save(pabellon);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(pabellon pabellon){
        try{
            repositorio.save(pabellon);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(long id){
        try{
            pabellon pabellon = repositorio.findByIdPabellon(id);
            repositorio.delete(pabellon);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public pabellon obtenerporId(long id){
        return repositorio.findByIdPabellon(id);
    }

    public List<medico> obtenerByPabellon(long id){
        return repositorio.findByPabellon(id);
    }
}