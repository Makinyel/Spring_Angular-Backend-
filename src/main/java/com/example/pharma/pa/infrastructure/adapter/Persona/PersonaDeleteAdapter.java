package com.example.pharma.pa.infrastructure.adapter.Persona;

import com.example.pharma.pa.domain.service.Persona.PersonaDeleteService;
import com.example.pharma.pa.infrastructure.repository.PersonaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PersonaDeleteAdapter implements PersonaDeleteService {

    private final PersonaRepository personaRepository;
    @Override
    public void deletePersona(String id) {
        personaRepository.deleteById(id);
    }
}
