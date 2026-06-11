package com.petland.service;

import com.petland.model.dto.AnimalResponse;
import com.petland.model.entity.AnimalEntity;
import com.petland.repository.AnimalRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public List<AnimalResponse> listar() {
        List<AnimalEntity> entities = animalRepository.findAll();
        List<AnimalResponse> responses = new ArrayList<>();
        for(AnimalEntity e: entities) {
            AnimalResponse res = new AnimalResponse();
            res.setId(e.getId());
            BeanUtils.copyProperties(e, res);
            responses.add(res);
        }

        return responses;
    }
}
