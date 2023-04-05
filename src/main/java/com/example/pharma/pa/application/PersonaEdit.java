package com.example.pharma.pa.application;

import com.example.pharma.pa.domain.entities.Persona;
import com.example.pharma.pa.domain.service.PersonaEditService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PersonaEdit {
    private final PersonaEditService personaEditService;
    public void editPersona(Persona persona){
        personaEditService.editPersona(persona);
    }

}
