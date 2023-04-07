package com.example.pharma.pa.infrastructure.mapper;


import com.example.pharma.pa.domain.entities.unimedida.UniMedida;
import com.example.pharma.pa.infrastructure.dto.unimedida.UniMedidaDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "Spring")
public interface UniMedidaMapper {
    UniMedidaDto uniMedidaDto(UniMedida uniMedida);
    UniMedida toEntity(UniMedidaDto uniMedidaDto);

}
