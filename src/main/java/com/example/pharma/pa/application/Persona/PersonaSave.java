package com.example.pharma.pa.application.Persona;

import com.example.pharma.pa.domain.entities.Persona.Persona;
import com.example.pharma.pa.domain.service.Persona.PersonaSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PersonaSave {
    private final PersonaSaveService personaSaveService;
    public Persona savePersona(Persona persona) {
        return personaSaveService.savePersona(persona);
    }
}
