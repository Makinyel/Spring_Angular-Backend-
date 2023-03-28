package com.example.pharma.pa.application;

import com.example.pharma.pa.domain.entities.Persona;
import com.example.pharma.pa.domain.service.PersonaGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PersonaGet {

    private final PersonaGetService personaGetService;
    public Persona getPersona(String id){
        return personaGetService.getPersona(id);
    }
}
