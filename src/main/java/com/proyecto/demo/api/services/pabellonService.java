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
    
    public pabellon crear(pabellon pabellon){
        try{
            repositorio.save(pabellon);
            return pabellon;
        } catch (Exception e){
            System.out.println("No se pudo agregar pabellon");
            return pabellon;
        }
    }

    public pabellon actualizar(pabellon pabellon){
        try{
            repositorio.save(pabellon);
            return pabellon;
        } catch (Exception e){
            System.out.println("No se pudo actualizar pabellon");
            return pabellon;
        }
    }

    public boolean borrar(int personalId){
        try{
            pabellon pabellon = repositorio.findBypersonalId(personalId);
            repositorio.delete(pabellon);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public pabellon obtenerporpabellonId(int pabellonId){
        return repositorio.findBypabellonId(pabellonId);
    }

    public List<pabellon> obtenerBypabellonId(int id){
        return repositorio.findAllBypabellonId(id);
    }

    public List<pabellon> obtenerAll() {
        return repositorio.findAll();
    }
}