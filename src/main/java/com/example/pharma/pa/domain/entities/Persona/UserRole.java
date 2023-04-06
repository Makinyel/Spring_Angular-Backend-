package com.example.pharma.pa.domain.entities.Persona;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor

public enum UserRole {
    admin,gerenteVenta,gerenteCompra,analista,proveedor,cliente;
}
