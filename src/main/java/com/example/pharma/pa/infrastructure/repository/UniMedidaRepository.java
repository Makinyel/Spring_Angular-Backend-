package com.example.pharma.pa.infrastructure.repository;

import com.example.pharma.pa.domain.entities.unimedida.UniMedida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniMedidaRepository extends JpaRepository<UniMedida,String> {
}
