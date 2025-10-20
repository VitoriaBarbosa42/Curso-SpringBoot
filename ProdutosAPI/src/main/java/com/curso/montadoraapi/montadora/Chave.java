package com.curso.montadoraapi.montadora;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Chave {
    private Montadora montadora;
    private String tipo;
}
