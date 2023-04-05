package com.example.pharma.pa.infrastructure.adapter;

import com.example.pharma.pa.domain.service.PersonaDeleteService;
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
