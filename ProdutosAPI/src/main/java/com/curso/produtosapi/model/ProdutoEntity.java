package com.curso.produtosapi.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Table(name = "produto")
@Entity
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private Double preco;

    public ProdutoEntity(String nome, String descricao, Double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
}
