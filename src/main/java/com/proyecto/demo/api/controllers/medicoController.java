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
@RequestMapping("/v1/medico")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class medicoController{
    @Autowired
    @Qualifier("servicemedico")
    medicoService servicio;

    @GetMapping("/")
    public medico obtenerMedico(@RequestParam(name="medicoId", required=true) int id){
        return servicio.obtenerporId(id);
    }

    @PostMapping("/")
    public boolean agregarMedico(@RequestBody @Valid medico medico){
        return servicio.crear(medico);
    }

    @PutMapping("/")
    public boolean actualizarMedico(@RequestBody @Valid medico medico){
        return servicio.actualizar(medico);
    }

    @DeleteMapping("/{id}")
    public boolean borrarMedico(@PathVariable("medicoId") int id){
        return servicio.borrar(id);
    }

    @GetMapping("/medicos")
    public List<medico> getAllMedico(){
        return servicio.obtenerAll();
    }

}