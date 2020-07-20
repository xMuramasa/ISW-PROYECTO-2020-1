package com.proyecto.demo.api.controllers;

import java.util.List;

import javax.validation.Valid;

import com.proyecto.demo.api.models.medico;
import com.proyecto.demo.api.services.medicoService;

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
@RequestMapping("/v1/equipo")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class medicoController{
    @Autowired
    @Qualifier("medicoService")
    medicoService servicio;

    @GetMapping("/")
    public Equipo obtenerEquipo(@RequestParam(name="id", required=true) long id){
        return servicio.obtenerporId(id);
    }

    @PostMapping("/")
    public boolean agregarEquipo(@RequestBody @Valid Equipo equipo){
        return servicio.crear(equipo);
    }

    @PutMapping("/")
    public boolean actualizarEquipo(@RequestBody @Valid Equipo equipo){
        return servicio.actualizar(equipo);
    }

    @DeleteMapping("/{id}")
    public boolean borrarEquipo(@PathVariable("id") long id){
        return servicio.borrar(id);
    }

    @GetMapping("/equipos")
    public List<Equipo> getAllEquipo(){
        return servicio.obtenerAll();
    }

}