package com.petland.cadastro.service;

import com.petland.cadastro.model.dto.ClienteRequestDTO;
import com.petland.cadastro.model.dto.ClienteResponseDTO;
import com.petland.cadastro.model.entity.ClienteEntity;
import com.petland.cadastro.repository.ClienteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteResponseDTO> listar() {
        List<ClienteEntity> entities = clienteRepository.findAll();
        List<ClienteResponseDTO> responses = new ArrayList<>();
        for(ClienteEntity e: entities) {
            ClienteResponseDTO res = new ClienteResponseDTO();
            res.setId(e.getId());
            BeanUtils.copyProperties(e, res);
            responses.add(res);
        }

        return responses;
    }

    public Integer gravar(ClienteRequestDTO requisicao) {
        ClienteEntity entity = new ClienteEntity();
        BeanUtils.copyProperties(requisicao, entity);
        return clienteRepository.save(entity).getId();
    }

    public Integer alterar(Integer id, ClienteRequestDTO requisicao) {
        ClienteEntity entity = clienteRepository.findById(id).orElse(null);
        if(entity != null) {
            BeanUtils.copyProperties(requisicao, entity);
            return clienteRepository.save(entity).getId();
        }
        return null;
    }

    public void excluir(Integer id) {
        clienteRepository.deleteById(id);
    }
}
