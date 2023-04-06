package com.example.pharma.pa.infrastructure.repository;

import com.example.pharma.pa.infrastructure.dto.Persona.PersonaDto;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaDto,String> {

    @Query(nativeQuery = true, value = "update persona_dto set nombre = :nombre, apellido = :apellido, " +
            "ubicacion =:ubicacion, telefono = :telefono, email = :email, rol = :rol where id = :id")
    @Modifying
    public void editPersona(@Param("nombre") String nombre,
                            @Param("apellido") String apellido,
                            @Param("ubicacion") String ubicacion,
                            @Param("telefono") String telefono,
                            @Param("email") String email,
                            @Param("rol") String rol,
                            @Param("id") String id);
}
