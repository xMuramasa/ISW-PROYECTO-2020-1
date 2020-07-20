package com.proyecto.demo.api.services;

import java.util.List;

import com.ayudantia.demo.HLTV.Modelos.Torneo;
import com.ayudantia.demo.HLTV.Repositorios.TorneoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("serviciotorneo")
public class TorneoServicio{
    @Autowired
    @Qualifier("repositoriotorneo")
    private TorneoRepositorio repositorio;

    public boolean crear(Torneo torneo){
        try{
            repositorio.save(torneo);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Torneo torneo){
        try{
            repositorio.save(torneo);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(long id){
        try{
            Torneo torneo = repositorio.findById(id);
            repositorio.delete(torneo);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Torneo obtenerporId(long id){
        return repositorio.findById(id);
    }

    public List<Torneo> obtenerAll(Pageable pageable){
        return repositorio.findAll(pageable).getContent();
    }

    public List<Torneo> obtenerporPais(String pais){
        return repositorio.findByPais(pais);
    }
}