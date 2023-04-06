package com.example.pharma.pa.application;

import com.example.pharma.pa.domain.entities.Persona.Persona;
import com.example.pharma.pa.domain.service.Persona.PersonaGetService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Service
@Slf4j
public class PersonaGet {

    private final PersonaGetService personaGetService;
    public Persona getPersona(String id){
        Persona persona = personaGetService.getPersona(id);
        if (Objects.isNull(persona)) {
            log.info("La Persona CON el Id {} NO ESTA REGISTRADO", id);
        }
        return personaGetService.getPersona(id);

    }

    public List<Persona> getAllPersonas() {
        return personaGetService.getAllPersonas();
    }
}
