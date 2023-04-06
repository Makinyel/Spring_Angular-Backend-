package com.example.pharma.pa.domain.entities.Persona;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Persona {
    private String id;
    private String nombre;
    private String apellido;
    private String ubicacion;
    private String telefono;
    private String email;
    private UserRole rol;

}
