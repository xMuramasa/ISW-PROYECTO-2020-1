package com.proyecto.demo.api.controllers;

import java.util.List;

import javax.validation.Valid;

import com.proyecto.demo.api.models.personal;
import com.proyecto.demo.api.services.personalService;

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
@RequestMapping("/personal")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class personalController{
    @Autowired
    @Qualifier("servicepersonal")
    personalService servicio;

    @GetMapping("/{id}")
    public personal obtenerPersonal(@PathVariable("id") int id){
        return servicio.obtenerporId(id);
    }

    @PostMapping("/")
    public personal agregarPersonal(@RequestBody @Valid personal personal){
        return servicio.crear(personal);
    }

    @PutMapping("/")
    public personal actualizarPersonal(@RequestBody @Valid personal personal){
        return servicio.actualizar(personal);
    }

    @DeleteMapping("/{id}")
    public boolean borrarPersonal(@PathVariable("id") int id){
        return servicio.borrar(id);
    }

    @GetMapping("/getAllPersonal")
    public List<personal> getAllPersonal(){
        return servicio.obtenerAll();
    }

}