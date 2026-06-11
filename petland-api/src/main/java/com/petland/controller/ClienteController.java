package com.petland.controller;

import com.petland.model.dto.ClienteRequestDTO;
import com.petland.model.dto.ClienteResponseDTO;
import com.petland.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public List<ClienteResponseDTO> get() {
        return clienteService.listar();
    }

    @PostMapping()
    public Integer post(@RequestBody ClienteRequestDTO requisicao) {
        return clienteService.gravar(requisicao);
    }

    @PutMapping("/{id}")
    public Integer put(@PathVariable("id") Integer id, @RequestBody ClienteRequestDTO requisicao) {
        return clienteService.alterar(id, requisicao);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        clienteService.excluir(id);
    }
}
