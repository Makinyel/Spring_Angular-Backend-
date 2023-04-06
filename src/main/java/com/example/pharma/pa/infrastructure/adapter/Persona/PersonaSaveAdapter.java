package com.example.pharma.pa.infrastructure.adapter.Persona;

import com.example.pharma.pa.domain.entities.Persona.Persona;
import com.example.pharma.pa.domain.service.Persona.PersonaSaveService;
import com.example.pharma.pa.infrastructure.mapper.PersonaMapper;
import com.example.pharma.pa.infrastructure.repository.PersonaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PersonaSaveAdapter implements PersonaSaveService {
    private final PersonaRepository personaRepository;
    private final PersonaMapper personaMapper;
    @Override
    public Persona savePersona(Persona persona) {
        return personaMapper.toPersonaEntity(personaRepository.save(personaMapper.personaDto(persona)));
    }
}
