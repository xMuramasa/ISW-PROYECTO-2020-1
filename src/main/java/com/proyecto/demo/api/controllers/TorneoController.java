package com.proyecto.demo.api.controllers;

import java.util.List;

import javax.validation.Valid;

import com.ayudantia.demo.HLTV.Modelos.Torneo;
import com.ayudantia.demo.HLTV.Servicios.TorneoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
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
@RequestMapping("/v1/torneo") // "localhost:8000/v1/torneo/*"
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class TorneoController{
    @Autowired
    @Qualifier("serviciotorneo")
    TorneoServicio servicio;

    @GetMapping("/torneo")
    public Torneo obtenerTorneo(@RequestParam(name="id", required=true) long id){
        return servicio.obtenerporId(id);
    }

    @PostMapping("/torneo")
    public boolean agregarTorneo(@RequestBody @Valid Torneo torneo){
        return servicio.crear(torneo);
    }

    @PutMapping("/torneo")
    public boolean actualizarTorneo(@RequestBody @Valid Torneo torneo){
        return servicio.actualizar(torneo);
    }

    @DeleteMapping("/torneo/{id}")
    public boolean borrarTorneo(@PathVariable("id") long id){
        return servicio.borrar(id);
    }

    @GetMapping("/getAll")
    public List<Torneo> getAllTorneo(Pageable pageable){ // de no especificarce, se usa un por defecto
        return servicio.obtenerAll(pageable);
    }

    @GetMapping("/getPais")
    public List<Torneo> getporPais(@RequestParam(name="pais", required = true) String pais){
        return servicio.obtenerporPais(pais);
    }

}