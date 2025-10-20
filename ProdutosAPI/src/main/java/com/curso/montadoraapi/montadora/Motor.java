package com.curso.montadoraapi.montadora;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Motor {
    private String modelo;
    private Integer cabalos;
    private Integer cilindros;
    private Double litragem;
    private TipoMotor tipo;

}
