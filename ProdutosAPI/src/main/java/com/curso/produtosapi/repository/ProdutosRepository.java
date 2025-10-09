package com.curso.produtosapi.repository;

import com.curso.produtosapi.model.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<ProdutoEntity, Long> {
}
