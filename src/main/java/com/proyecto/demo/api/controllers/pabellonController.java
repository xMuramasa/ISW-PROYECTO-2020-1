package com.proyecto.demo.api.controllers;

import java.util.List;

import javax.validation.Valid;

import com.proyecto.demo.api.models.pabellon;
import com.proyecto.demo.api.services.pabellonService;

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


import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;




@RestController
@RequestMapping("/personal/pabellon")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class pabellonController {
    @Autowired
    @Qualifier("servicepabellon")
    pabellonService servicio;

    @GetMapping("/{id]")
    public pabellon obtenerpabellon(@PathVariable("id") int id) {
        return servicio.obtenerporpabellonId(id);
    }

    @PostMapping("/")
    public pabellon agregarpabellon(@RequestBody @Valid pabellon pabellon) {
        return servicio.crear(pabellon);
    }

    @PutMapping("/")
    public pabellon actualizarpabellon(@RequestBody @Valid pabellon pabellon) {
        return servicio.actualizar(pabellon);
    }

    @DeleteMapping("/{pabellonId}")
    public boolean borrarpabellon(@PathVariable("pabellonId") int pabellonId) {
        return servicio.borrar(pabellonId);
    }

    @GetMapping("/getAllPabellon/{pabellonId}")
    public List<pabellon> obtenerByPabellon(@PathVariable("pabellonId") int pabellonId) {
        return servicio.obtenerBypabellonId(pabellonId);
    }

    @GetMapping("/getAllPabellon/todos")
    public List<pabellon> getAllPabellon(){
        return servicio.obtenerAll();
    }

}