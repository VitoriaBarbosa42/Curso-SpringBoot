package com.curso.montadoraapi.api;

import com.curso.montadoraapi.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class TesteFabricaController {

    @Autowired
    @Eletrico
    public Motor motor;

    @PostMapping("/ignicao")
    public StatusCarro ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return  carro.darIgnicao(chave);
    }
}
