package com.proyecto.demo.api.services;

import java.util.List;

import com.ayudantia.demo.HLTV.Modelos.Jugador;
import com.ayudantia.demo.HLTV.Repositorios.JugadorRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviciojugador")
public class JugadorServicio{

    @Autowired
    @Qualifier("repositoriojugador")
    private JugadorRepositorio repositorio;
    
    public boolean crear(Jugador jugador){
        try{
            repositorio.save(jugador);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Jugador jugador){
        try{
            repositorio.save(jugador);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(long id){
        try{
            Jugador jugador = repositorio.findById(id);
            repositorio.delete(jugador);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Jugador obtenerporId(long id){
        return repositorio.findById(id);
    }

    public List<Jugador> obtenerByEquipo(long equipo){
        return repositorio.findByEquipo(equipo);
    }
}