package com.petland.cadastro.repository;

import com.petland.cadastro.model.entity.ProdutoServicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServicoEntity, Integer> {
}
