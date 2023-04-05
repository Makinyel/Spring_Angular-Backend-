package com.example.pharma.pa.domain.service;

import com.example.pharma.pa.domain.entities.Persona;

import java.util.List;

public interface PersonaGetService {
    Persona getPersona(String id);
    List<Persona> getAllPersonas();
}
