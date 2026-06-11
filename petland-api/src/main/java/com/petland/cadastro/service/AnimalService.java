package com.petland.cadastro.service;

import com.petland.cadastro.model.dto.AnimalRequestDTO;
import com.petland.cadastro.model.dto.AnimalResponseDTO;
import com.petland.cadastro.model.entity.AnimalEntity;
import com.petland.cadastro.repository.AnimalRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public List<AnimalResponseDTO> listar() {
        List<AnimalEntity> entities = animalRepository.findAll();
        List<AnimalResponseDTO> responses = new ArrayList<>();
        for(AnimalEntity e: entities) {
            AnimalResponseDTO res = new AnimalResponseDTO();
            res.setId(e.getId());
            BeanUtils.copyProperties(e, res);
            responses.add(res);
        }

        return responses;
    }

    public Integer gravar(AnimalRequestDTO requisicao) {
        AnimalEntity entity = new AnimalEntity();
        BeanUtils.copyProperties(requisicao, entity);
        return animalRepository.save(entity).getId();
    }

    public Integer alterar(Integer id, AnimalRequestDTO requisicao) {
        AnimalEntity entity = animalRepository.findById(id).orElse(null);
        if(entity != null) {
            BeanUtils.copyProperties(requisicao, entity);
            return animalRepository.save(entity).getId();
        }
        return null;
    }

    public void excluir(Integer id) {
        animalRepository.deleteById(id);
    }
}
