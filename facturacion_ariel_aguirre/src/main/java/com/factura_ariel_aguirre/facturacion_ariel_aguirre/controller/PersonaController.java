package com.factura_ariel_aguirre.facturacion_ariel_aguirre.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.Persona;
import com.factura_ariel_aguirre.facturacion_ariel_aguirre.service.PersonaService;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping("/crear")
    public ResponseEntity<Persona> crearPersona(@RequestBody Persona persona) {
        return ResponseEntity.ok(personaService.crearPersona(persona));
    }

    @GetMapping("/{dni}")
    public ResponseEntity<Persona> obtenerPorDni(@PathVariable String dni) {
        return ResponseEntity.ok(personaService.obtenerPorDni(dni));
    }

    @GetMapping
    public ResponseEntity<List<Persona>> listarPersonas() {
        return ResponseEntity.ok(personaService.listarPersona());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Persona> actualizarPersona(@PathVariable Integer id, @RequestBody Persona persona) {
        return ResponseEntity.ok(personaService.actualizarPersona(id, persona));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPersona(@PathVariable Integer id) {
        personaService.eliminarPersona(id);
        return ResponseEntity.noContent().build();
    }

}
