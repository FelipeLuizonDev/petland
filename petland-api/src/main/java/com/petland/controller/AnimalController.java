package com.petland.controller;

import com.petland.model.Animal;
import com.petland.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {
    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/animal")
    public List<Animal> listar() {
        return animalRepository.findAll();
    }
}
