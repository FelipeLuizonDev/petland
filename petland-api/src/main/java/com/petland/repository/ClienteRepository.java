package com.petland.repository;

import com.petland.model.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
}
