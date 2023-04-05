package com.example.pharma.pa.infrastructure.adapter;

import com.example.pharma.pa.application.PersonaGet;
import com.example.pharma.pa.domain.entities.Persona;
import com.example.pharma.pa.domain.service.PersonaEditService;
import com.example.pharma.pa.infrastructure.repository.PersonaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PersonaEditAdapter implements PersonaEditService {
    private final PersonaRepository personaRepository;
    private final PersonaGet personaGet;

    @Override
    public void editPersona(Persona persona) {
        Persona p = personaGet.getPersona(persona.getId());
        personaRepository.editPersona(p.getNombre(),
                p.getApellido(),
                p.getUbicacion(),
                p.getTelefono(),
                p.getEmail(),
                p.getRol().toString(),
                p.getId());
    }
}
