package com.example.pharma.pa.infrastructure.api.controller;

import com.example.pharma.pa.application.PersonaGet;
import com.example.pharma.pa.application.PersonaSave;
import com.example.pharma.pa.domain.entities.Persona;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping(path = "/persona")
public class PersonaController {
    private final PersonaSave personaSave;
    private final PersonaGet personaGet;
    @PostMapping
    public ResponseEntity<Persona> savePersona(@RequestBody Persona persona) {
        return new ResponseEntity<>(personaSave.savePersona(persona), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Persona> getPersonaById(@RequestParam String id) {
        return ResponseEntity.ok(personaGet.getPersona(id));
    }
}
