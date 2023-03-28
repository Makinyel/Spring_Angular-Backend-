package com.example.pharma.pa.infrastructure.repository;

import com.example.pharma.pa.infrastructure.dto.PersonaDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaDto,String> {
}
