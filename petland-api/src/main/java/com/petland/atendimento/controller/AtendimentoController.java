package com.petland.atendimento.controller;

import com.petland.atendimento.model.dto.AtendimentoRequestDTO;
import com.petland.atendimento.model.dto.AtendimentoResponseDTO;
import com.petland.atendimento.service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {
    @Autowired
    private AtendimentoService atendimentoService;

    @GetMapping()
    public List<AtendimentoResponseDTO> get() {
        return atendimentoService.listar();
    }

    @PostMapping()
    public Integer post(@RequestBody AtendimentoRequestDTO requisicao) {
        return atendimentoService.gravar(requisicao);
    }

    @PutMapping("/{id}")
    public Integer put(@PathVariable("id") Integer id, @RequestBody AtendimentoRequestDTO requisicao) {
        return atendimentoService.alterar(id, requisicao);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        atendimentoService.excluir(id);
    }
}
