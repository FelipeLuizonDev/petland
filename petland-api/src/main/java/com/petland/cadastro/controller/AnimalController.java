package com.petland.cadastro.controller;

import com.petland.cadastro.model.dto.AnimalRequestDTO;
import com.petland.cadastro.model.dto.AnimalResponseDTO;
import com.petland.cadastro.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping()
    public List<AnimalResponseDTO> get() {
        return animalService.listar();
    }

    @PostMapping()
    public Integer post(@RequestBody AnimalRequestDTO requisicao) {
        return animalService.gravar(requisicao);
    }

    @PutMapping("/{id}")
    public Integer put(@PathVariable("id") Integer id, @RequestBody AnimalRequestDTO requisicao) {
        return animalService.alterar(id, requisicao);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        animalService.excluir(id);
    }
}
