package com.proyecto.demo.api.services;

import com.ayudantia.demo.HLTV.Modelos.Partido;
import com.ayudantia.demo.HLTV.Repositorios.PartidoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviciopartido")
public class PartidoServicio{

    @Autowired
    @Qualifier("repositoriopartido")
    private PartidoRepositorio repositorio;

    public boolean crear(Partido partido){
        try{
            repositorio.save(partido);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Partido partido){
        try{
            repositorio.save(partido);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(long id){
        try{
            Partido partido = repositorio.findById(id);
            repositorio.delete(partido);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Partido obtenerporId(long id){
        return repositorio.findById(id);
    }
}
