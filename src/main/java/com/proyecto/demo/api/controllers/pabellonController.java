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

@RestController
@RequestMapping("/personal")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class pabellonController {
    @Autowired
    @Qualifier("servicepabellon")
    pabellonService servicio;

    @GetMapping("/pabellon")
    public pabellon obtenerpabellon(@RequestParam(name = "id", required = true) int id) {
        return servicio.obtenerporpabellonId(id);
    }

    @PostMapping("/pabellon")
    public boolean agregarpabellon(@RequestBody @Valid pabellon pabellon) {
        return servicio.crear(pabellon);
    }

    @PutMapping("/pabellon")
    public boolean actualizarpabellon(@RequestBody @Valid pabellon pabellon) {
        return servicio.actualizar(pabellon);
    }

    @DeleteMapping("/pabellon/{pabellonId}&{personalId}")
    public boolean borrarpabellon(@PathVariable("pabellonId") int pabellonId, @PathVariable("personalId") int personalId) {
        return servicio.borrar(pabellonId, personalId);
    }

    @GetMapping("/getAllPabellon")
    public List<pabellon> obtenerByPabellon(@RequestParam(name = "pabellonId", required = true) int id) {
        return servicio.obtenerBypabellonId(id);
    }

}