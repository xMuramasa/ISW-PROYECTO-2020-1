package com.proyecto.demo.api.controllers;

import java.util.List;

import javax.validation.Valid;

import com.proyecto.demo.api.models.medico;
import com.proyecto.demo.api.models.quimioterapia;
import com.proyecto.demo.api.services.quimioterapiaService;

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
@RequestMapping("/v1/quimioterapia")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class quimioterapiaController {
    @Autowired
    @Qualifier("servicequimioterapia")
    quimioterapiaService servicio;

    @GetMapping("/quimioterapia")
    public quimioterapia obtenerquimioterapia(@RequestParam(name = "id", required = true) long id) {
        return servicio.obtenerporId(id);
    }

    @PostMapping("/quimioterapia")
    public boolean agregarquimioterapia(@RequestBody @Valid quimioterapia quimioterapia) {
        return servicio.crear(quimioterapia);
    }

    @PutMapping("/quimioterapia")
    public boolean actualizarquimioterapia(@RequestBody @Valid quimioterapia quimioterapia) {
        return servicio.actualizar(quimioterapia);
    }

    @DeleteMapping("/quimioterapia/{id}")
    public boolean borrarquimioterapia(@PathVariable("id") long id) {
        return servicio.borrar(id);
    }

    @GetMapping("/medico")
    public List<medico> obtenerByquimioterapia(@RequestParam(name = "medico", required = true) long id) {
        return servicio.obtenerByquimioterapia(id);
    }

}