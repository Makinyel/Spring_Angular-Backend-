package com.example.pharma.pa.infrastructure.mapper;

import com.example.pharma.pa.domain.entities.Persona.Persona;
import com.example.pharma.pa.infrastructure.dto.Persona.PersonaDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface PersonaMapper {
    PersonaDto personaDto(Persona persona);
    Persona toPersonaEntity(PersonaDto personaDto);
}
