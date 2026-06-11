package com.petland.service;

import com.petland.model.dto.ProdutoServicoRequestDTO;
import com.petland.model.dto.ProdutoServicoResponseDTO;
import com.petland.model.entity.ProdutoServicoEntity;
import com.petland.repository.ProdutoServicoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoServicoService {
    @Autowired
    private ProdutoServicoRepository produtoServicoRepository;

    public List<ProdutoServicoResponseDTO> listar() {
        List<ProdutoServicoEntity> entities = produtoServicoRepository.findAll();
        List<ProdutoServicoResponseDTO> responses = new ArrayList<>();
        for(ProdutoServicoEntity e: entities) {
            ProdutoServicoResponseDTO res = new ProdutoServicoResponseDTO();
            res.setId(e.getId());
            BeanUtils.copyProperties(e, res);
            responses.add(res);
        }

        return responses;
    }

    public Integer gravar(ProdutoServicoRequestDTO requisicao) {
        ProdutoServicoEntity entity = new ProdutoServicoEntity();
        BeanUtils.copyProperties(requisicao, entity);
        return produtoServicoRepository.save(entity).getId();
    }

    public Integer alterar(Integer id, ProdutoServicoRequestDTO requisicao) {
        ProdutoServicoEntity entity = produtoServicoRepository.findById(id).orElse(null);
        if(entity != null) {
            BeanUtils.copyProperties(requisicao, entity);
            return produtoServicoRepository.save(entity).getId();
        }
        return null;
    }

    public void excluir(Integer id) {
        produtoServicoRepository.deleteById(id);
    }
}
