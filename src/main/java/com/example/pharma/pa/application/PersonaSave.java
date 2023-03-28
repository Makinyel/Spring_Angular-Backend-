package com.example.pharma.pa.application;

import com.example.pharma.pa.domain.entities.Persona;
import com.example.pharma.pa.domain.service.PersonaSaveService;
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
