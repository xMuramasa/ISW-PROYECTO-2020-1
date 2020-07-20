package com.proyecto.demo.api.services;

import java.util.List;

import com.proyecto.demo.api.models.pabellon;
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

    public boolean borrar(int id){
        try{
            pabellon pabellon = repositorio.findBypabellonId(id);
            repositorio.delete(pabellon);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public pabellon obtenerporId(int id){
        return repositorio.findBypabellonId(id);
    }

    public List<pabellon> obtenerBypabellonId(int id){
        return repositorio.findAllBypabellonId(id);
    }
}