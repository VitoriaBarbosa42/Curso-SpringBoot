package com.curso.produtosapi.controller;


import com.curso.produtosapi.model.ProdutoEntity;
import com.curso.produtosapi.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutosRepository produtosRepository;

    @PostMapping("/salvar")
    public ProdutoEntity salvar(@RequestBody ProdutoEntity produto) {
        System.out.println("Produto recebido: " + produto);
        produtosRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public ProdutoEntity obterPorId(@PathVariable("id") Long id){
        return produtosRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleter(@PathVariable("id") Long id) {
        produtosRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public String atualizar(@PathVariable("id") Long id, @RequestBody ProdutoEntity produto) {
        produto.setId(id);
        produtosRepository.save(produto);
        String atualizado = "OK";
        return atualizado;
    }

    @GetMapping("/buscanome")
    public List<ProdutoEntity> buscarPorNome(@RequestParam("nome") String nome){
        return produtosRepository.findByNome(nome);
    }
}


