package com.example.pharma.pa.infrastructure.dto.unimedida;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class UniMedidaDto {
    @Id
    String id;
    String name;
    String prefijo;
    String estado;

}
