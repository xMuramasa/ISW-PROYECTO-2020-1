package com.proyecto.demo.api.controllers;

import java.util.List;

import javax.validation.Valid;

import com.proyecto.demo.api.models.medico;
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

@RestController
@RequestMapping("/v1/pabellon")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class pabellonController {
    @Autowired
    @Qualifier("servicepabellon")
    pabellonService servicio;

    @GetMapping("/pabellon")
    public pabellon obtenerpabellon(@RequestParam(name = "id", required = true) int id) {
        return servicio.obtenerporId(id);
    }

    @PostMapping("/pabellon")
    public boolean agregarpabellon(@RequestBody @Valid pabellon pabellon) {
        return servicio.crear(pabellon);
    }

    @PutMapping("/pabellon")
    public boolean actualizarpabellon(@RequestBody @Valid pabellon pabellon) {
        return servicio.actualizar(pabellon);
    }

    @DeleteMapping("/pabellon/{id}")
    public boolean borrarpabellon(@PathVariable("id") int id) {
        return servicio.borrar(id);
    }

    @GetMapping("/medico")
    public List<medico> obtenerByPabellon(@RequestParam(name = "medico", required = true) int id) {
        return servicio.obtenerByPabellon(id);
    }

}