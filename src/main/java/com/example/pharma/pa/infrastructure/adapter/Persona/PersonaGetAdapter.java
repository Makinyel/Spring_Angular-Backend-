package com.example.pharma.pa.infrastructure.adapter.Persona;

import com.example.pharma.pa.domain.entities.Persona.Persona;
import com.example.pharma.pa.domain.service.Persona.PersonaGetService;
import com.example.pharma.pa.infrastructure.dto.Persona.PersonaDto;
import com.example.pharma.pa.infrastructure.mapper.PersonaMapper;
import com.example.pharma.pa.infrastructure.repository.PersonaRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
@Slf4j
public class PersonaGetAdapter implements PersonaGetService {

    private final PersonaMapper personaMapper;
    private final PersonaRepository personaRepository;
    @Override
    public Persona getPersona(String id) {
        Optional<PersonaDto> personadto = personaRepository.findById(id);
        return personadto.map(personaMapper::toPersonaEntity).orElse(null);
    }

    @Override
    public List<Persona> getAllPersonas() {
        List<PersonaDto> listDto = personaRepository.findAll();
        return listDto.stream().map(personaMapper::toPersonaEntity).toList();

    }
}
