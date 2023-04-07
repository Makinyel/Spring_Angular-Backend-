package com.example.pharma.pa.infrastructure.api.controller;

import com.example.pharma.pa.domain.entities.unimedida.UniMedida;
import com.example.pharma.pa.infrastructure.repository.UniMedidaRepository;
import com.example.pharma.pa.share.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/uniMedida")
public class UniMedidaController {
    @Autowired
    private UniMedidaRepository uniMedidaRepository;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UniMedida saveUnimedida(@RequestBody UniMedida uniMedida) {
        return (uniMedidaRepository.save(uniMedida));
    }
    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<UniMedida> getunimedida(@PathVariable String id) {
        return (uniMedidaRepository.findById(id));
    }
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<UniMedida> getAll() {
        List<UniMedida> lista = (uniMedidaRepository.findAll());
        return lista;
    }
    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public void editUniMedida(@RequestBody UniMedida detallesuniMedida){
        UniMedida uniMedida = uniMedidaRepository.findById(detallesuniMedida.getId()).orElseThrow
                (() -> new NotFoundException("No Exite Unidad De Mediad Con El Id: "
                        +detallesuniMedida.getId()));

        uniMedida.setName(detallesuniMedida.getName());
        uniMedida.setPrefijo(detallesuniMedida.getPrefijo());
        uniMedida.setEstado(detallesuniMedida.getEstado());
        uniMedidaRepository.save(uniMedida);
    }
    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteuniMedida(@PathVariable String id) {
        uniMedidaRepository.deleteById(id);
    }

}