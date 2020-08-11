package com.proyecto.demo.api.controllers;

import java.util.List;

import javax.validation.Valid;

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
@RequestMapping("/personal/quimioterapia")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class quimioterapiaController {
    @Autowired
    @Qualifier("servicequimioterapia")
    quimioterapiaService servicio;

    @GetMapping("/{id}")
    public quimioterapia obtenerquimioterapia(@PathVariable("id") int id) {
        return servicio.obtenerporId(id);
    }

    @PostMapping("/")
    public quimioterapia agregarquimioterapia(@RequestBody @Valid quimioterapia quimioterapia) {
        return servicio.crear(quimioterapia);
    }

    @PutMapping("/")
    public quimioterapia actualizarquimioterapia(@RequestBody @Valid quimioterapia quimioterapia) {
        return servicio.actualizar(quimioterapia);
    }

    @DeleteMapping("/")
    public boolean borrarquimioterapia(@RequestParam(name = "id", required = true) int id) {
        return servicio.borrar(id);
    }

    @GetMapping("/getAllQuimioterapia/{quimioterapiaId}")
    public List<quimioterapia> obtenerByquimioterapia(@PathVariable("quimioterapiaId") int quimioterapiaId) {
        return servicio.obtenerByquimioterapiaId(quimioterapiaId);
    }

}