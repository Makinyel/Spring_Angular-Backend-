package com.example.pharma.pa.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class PersonaDto {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private String ubicacion;
    private String telefono;
    private String email;
    @Enumerated(EnumType.STRING)
    private UserRoleEnum rol;

}
