package com.petland.controller;

import com.petland.model.dto.AnimalResponse;
import com.petland.model.entity.AnimalEntity;
import com.petland.repository.AnimalRepository;
import com.petland.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping()
    public List<AnimalResponse> get() {
        return animalService.listar();
    }
}
