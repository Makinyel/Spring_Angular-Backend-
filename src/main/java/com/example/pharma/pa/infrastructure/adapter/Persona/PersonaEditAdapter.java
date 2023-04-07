package com.example.pharma.pa.infrastructure.adapter.Persona;

import com.example.pharma.pa.domain.entities.Persona.Persona;
import com.example.pharma.pa.domain.service.Persona.PersonaEditService;
import com.example.pharma.pa.infrastructure.repository.PersonaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class PersonaEditAdapter implements PersonaEditService {
    private final PersonaRepository personaRepository;
    @Override
    @Transactional
    public void editPersona(Persona persona) {
        personaRepository.editPersona(persona.getNombre(),
                persona.getApellido(),
                persona.getUbicacion(),
                persona.getTelefono(),
                persona.getEmail(),
                persona.getRol().toString(),
                persona.getId());
    }
}
