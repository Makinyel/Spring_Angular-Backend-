package com.example.pharma.pa.infrastructure.api.controller;

import com.example.pharma.pa.application.Persona.PersonaDelete;
import com.example.pharma.pa.application.Persona.PersonaEdit;
import com.example.pharma.pa.application.Persona.PersonaGet;
import com.example.pharma.pa.application.Persona.PersonaSave;
import com.example.pharma.pa.domain.entities.Persona.Persona;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping(path = "/persona")
@CrossOrigin(origins = "http://localhost:4200/")
@Slf4j

public class PersonaController {
    private final PersonaSave personaSave;
    private final PersonaGet personaGet;
    private final PersonaDelete personaDelete;
    private final PersonaEdit personaEdit;
    @PostMapping(path = "/persona")
    public ResponseEntity<Persona> savePersona(@RequestBody Persona persona) {
        return new ResponseEntity<>(personaSave.savePersona(persona), HttpStatus.CREATED);
    }

    @GetMapping(path = "/persona/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable String id) {
        return ResponseEntity.ok(personaGet.getPersona(id));
    }
    @GetMapping(path = "/persona")
    public ResponseEntity<List<Persona>> getAllPersonas() {
        return ResponseEntity.ok(personaGet.getAllPersonas());
    }
    @DeleteMapping(path = "/persona/{id}")
    public void deletePersona(@PathVariable String id) {
        personaDelete.deletePersona(id);
    }

    @PutMapping(path = "/persona")
    public void editPersona(@RequestBody Persona persona){
        personaEdit.editPersona(persona);
    }



}
