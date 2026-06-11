package com.petland.model.dto;

import lombok.Data;

@Data
public class ProdutoServicoRequestDTO {
    private String nome;
    private Double valor;
    private boolean servico;
}
