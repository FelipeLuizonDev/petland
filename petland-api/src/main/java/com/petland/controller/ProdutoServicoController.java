package com.petland.controller;

import com.petland.model.ProdutoServico;
import com.petland.repository.ProdutoServicoRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoServicoController {
    @Autowired
    private ProdutoServicoRepository produtoServicoRepository;

    @GetMapping()
    public List<ProdutoServico> listar() {
        return produtoServicoRepository.findAll();
    }

    @PostMapping()
    public Integer gravar(@RequestBody ProdutoServico requisicao) {
        produtoServicoRepository.save(requisicao);
        return requisicao.getId();
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable("id")  Integer id, @RequestBody ProdutoServico requisicao) {
        requisicao.setId(id);
        produtoServicoRepository.save(requisicao);
        return requisicao.getId();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Integer id) {
        produtoServicoRepository.deleteById(id);
    }
}
