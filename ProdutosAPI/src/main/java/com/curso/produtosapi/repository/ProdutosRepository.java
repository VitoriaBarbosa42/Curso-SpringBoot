package com.curso.produtosapi.repository;

import com.curso.produtosapi.model.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<ProdutoEntity, Long> {

    List<ProdutoEntity> findByNome(String nome);
}
