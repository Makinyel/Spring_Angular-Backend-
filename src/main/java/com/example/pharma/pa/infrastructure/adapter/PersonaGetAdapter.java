package com.example.pharma.pa.infrastructure.adapter;

import com.example.pharma.pa.application.PersonaGet;
import com.example.pharma.pa.domain.entities.Persona;
import com.example.pharma.pa.domain.service.PersonaGetService;
import com.example.pharma.pa.infrastructure.dto.PersonaDto;
import com.example.pharma.pa.infrastructure.mapper.PersonaMapper;
import com.example.pharma.pa.infrastructure.repository.PersonaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class PersonaGetAdapter implements PersonaGetService {

    private final PersonaMapper personaMapper;
    private final PersonaRepository personaRepository;
    @Override
    public Persona getPersona(String id) {
        Optional<PersonaDto> personadto = personaRepository.findById(id);
        return personadto.map(personaMapper::toPersonaEntity).orElse(null);
    }
}
