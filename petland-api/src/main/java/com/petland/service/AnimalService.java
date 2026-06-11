package com.petland.service;

import com.petland.model.dto.AnimalRequestDTO;
import com.petland.model.dto.CadastroResponseDTO;
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

    public List<CadastroResponseDTO> listar() {
        List<AnimalEntity> entities = animalRepository.findAll();
        List<CadastroResponseDTO> responses = new ArrayList<>();
        for(AnimalEntity e: entities) {
            CadastroResponseDTO res = new CadastroResponseDTO();
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
