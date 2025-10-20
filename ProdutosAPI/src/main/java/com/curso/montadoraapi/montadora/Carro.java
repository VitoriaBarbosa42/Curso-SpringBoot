package com.curso.montadoraapi.montadora;

import lombok.*;

import java.awt.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Carro {
    private String modelo;
    private Color cor;
    private Motor motor;
    private Montadora montadora;
    private Boolean ignicao;

    public Carro(Motor motor) {
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor=" + cor +
                ", motor=" + motor +
                ", montadora=" + montadora +
                ", ignicao=" + ignicao +
                '}';
    }

    public StatusCarro darIgnicao(Chave chave) {
        if(chave.getMontadora() != this.montadora){
            setIgnicao(false);
            return new StatusCarro("Chave não compatível");
        }
        setIgnicao(true);
        return new StatusCarro("Carro ligado");
    }
}
