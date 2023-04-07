package com.example.pharma.pa.application.Persona;

import com.example.pharma.pa.domain.service.Persona.PersonaDeleteService;
import com.example.pharma.pa.infrastructure.api.controller.UniMedidaController;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PersonaDelete {
    private final PersonaDeleteService personaDeleteService;

    public void deletePersona(String id){
        personaDeleteService.deletePersona(id);
    }

}
