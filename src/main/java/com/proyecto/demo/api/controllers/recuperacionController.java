package com.proyecto.demo.api.controllers;

import java.util.List;

import javax.validation.Valid;

import com.proyecto.demo.api.models.recuperacion;
import com.proyecto.demo.api.services.recuperacionService;

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
@RequestMapping("/personal/recuperacion")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class recuperacionController {
    @Autowired
    @Qualifier("servicerecuperacion")
    recuperacionService servicio;

    @GetMapping("/{id}")
    public recuperacion obtenerrecuperacion(@PathVariable("id") int id) {
        return servicio.obtenerporId(id);
    }

    @PostMapping("/")
    public recuperacion agregarrecuperacion(@RequestBody @Valid recuperacion recuperacion) {
        return servicio.crear(recuperacion);
    }

    @PutMapping("/")
    public recuperacion actualizarrecuperacion(@RequestBody @Valid recuperacion recuperacion) {
        return servicio.actualizar(recuperacion);
    }

    @DeleteMapping("/")
    public boolean borrarrecuperacion(@RequestParam(name = "id", required = true) int id) {
        return servicio.borrar(id);
    }

    @GetMapping("/getAllRecuperacion{recuperacionId}")
    public List<recuperacion> obtenerByrecuperacion(@PathVariable("recuperacionId") int recuperacionId) {
        return servicio.obtenerByrecuperacionId(recuperacionId);
    }

}