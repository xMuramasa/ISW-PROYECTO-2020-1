package com.proyecto.demo.api.controllers;

import javax.validation.Valid;

import com.ayudantia.demo.HLTV.Modelos.Partido;
import com.ayudantia.demo.HLTV.Servicios.PartidoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/partido")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class PartidoController{
    @Autowired
    @Qualifier("serviciopartido")
    PartidoServicio servicio;

    @GetMapping("/partido")
    public Partido obtenerPartido(@RequestParam(name="id", required=true) long id){
        return servicio.obtenerporId(id);
    }

    @PostMapping("/partido")
    public boolean agregarPartido(@RequestBody @Valid Partido partido){
        return servicio.crear(partido);
    }

    @PutMapping("/partido")
    public boolean actualizarPartido(@RequestBody @Valid Partido partido){
        return servicio.actualizar(partido);
    }

    @DeleteMapping("/partido/{id}")
    public boolean borrarPartido(@PathVariable("id") long id){
        return servicio.borrar(id);
    }

}