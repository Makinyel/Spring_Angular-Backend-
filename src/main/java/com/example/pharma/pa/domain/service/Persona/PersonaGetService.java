package com.example.pharma.pa.domain.service.Persona;

import com.example.pharma.pa.domain.entities.Persona.Persona;

import java.util.List;

public interface PersonaGetService {
    Persona getPersona(String id);
    List<Persona> getAllPersonas();
}
