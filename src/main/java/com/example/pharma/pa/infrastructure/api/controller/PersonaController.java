package com.example.pharma.pa.infrastructure.api.controller;

import com.example.pharma.pa.application.PersonaDelete;
import com.example.pharma.pa.application.PersonaGet;
import com.example.pharma.pa.application.PersonaSave;
import com.example.pharma.pa.domain.entities.Persona;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping(path = "/persona")
@CrossOrigin(origins = "http://localhost:4200/")
public class PersonaController {
    private final PersonaSave personaSave;
    private final PersonaGet personaGet;
    private final PersonaDelete personaDelete;
//    private final PersonaEdit personaEdit;
    @PostMapping
    public ResponseEntity<Persona> savePersona(@RequestBody Persona persona) {
        return new ResponseEntity<>(personaSave.savePersona(persona), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<Persona> getPersonaById(@RequestParam String id) {
        return ResponseEntity.ok(personaGet.getPersona(id));
    }
    @GetMapping(path = "/personaAll")
    public ResponseEntity<List<Persona>> getAllPersonas() {
        return ResponseEntity.ok(personaGet.getAllPersonas());
    }
    @DeleteMapping(path = "/personaDelete")
    public void deletePersona(@RequestParam String id) {
        personaDelete.deletePersona(id);
    }

}
