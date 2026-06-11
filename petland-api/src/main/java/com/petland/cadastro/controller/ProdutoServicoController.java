package com.petland.cadastro.controller;

import com.petland.cadastro.model.dto.ProdutoServicoRequestDTO;
import com.petland.cadastro.model.dto.ProdutoServicoResponseDTO;
import com.petland.cadastro.service.ProdutoServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoServicoController {
    @Autowired
    private ProdutoServicoService produtoServicoService;

    @GetMapping()
    public List<ProdutoServicoResponseDTO> get() {
        return produtoServicoService.listar();
    }

    @PostMapping()
    public Integer post(@RequestBody ProdutoServicoRequestDTO requisicao) {
        return produtoServicoService.gravar(requisicao);
    }

    @PutMapping("/{id}")
    public Integer put(@PathVariable("id") Integer id, @RequestBody ProdutoServicoRequestDTO requisicao) {
        return produtoServicoService.alterar(id, requisicao);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        produtoServicoService.excluir(id);
    }
}
