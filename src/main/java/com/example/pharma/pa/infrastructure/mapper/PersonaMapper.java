package com.example.pharma.pa.infrastructure.mapper;

import ch.qos.logback.core.model.ComponentModel;
import com.example.pharma.pa.domain.entities.Persona;
import com.example.pharma.pa.infrastructure.dto.PersonaDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface PersonaMapper {
    PersonaDto personaDto(Persona persona);
    Persona toPersonaEntity(PersonaDto personaDto);
}
