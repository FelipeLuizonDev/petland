package com.petland.atendimento.service;

import com.petland.atendimento.model.dto.AtendimentoRequestDTO;
import com.petland.atendimento.model.dto.AtendimentoResponseDTO;
import com.petland.atendimento.model.entity.AtendimentoEntity;
import com.petland.atendimento.repository.AtendimentoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AtendimentoService {
    @Autowired
    private AtendimentoRepository atendimentoRepository;

    public List<AtendimentoResponseDTO> listar() {
        List<AtendimentoEntity> entities = atendimentoRepository.findAll();
        List<AtendimentoResponseDTO> responses = new ArrayList<>();
        for(AtendimentoEntity e: entities) {
            AtendimentoResponseDTO res = new AtendimentoResponseDTO();
            res.setId(e.getId());
            BeanUtils.copyProperties(e, res);
            responses.add(res);
        }

        return responses;
    }

    public Integer gravar(AtendimentoRequestDTO requisicao) {
        AtendimentoEntity entity = new AtendimentoEntity();
        BeanUtils.copyProperties(requisicao, entity);
        return atendimentoRepository.save(entity).getId();
    }

    public Integer alterar(Integer id, AtendimentoRequestDTO requisicao) {
        AtendimentoEntity entity = atendimentoRepository.findById(id).orElse(null);
        if(entity != null) {
            BeanUtils.copyProperties(requisicao, entity);
            return atendimentoRepository.save(entity).getId();
        }
        return null;
    }

    public void excluir(Integer id) {
        atendimentoRepository.deleteById(id);
    }
}
