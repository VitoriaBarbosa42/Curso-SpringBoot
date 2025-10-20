package com.curso.montadoraapi.montadora.config;

import com.curso.montadoraapi.montadora.Motor;
import com.curso.montadoraapi.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfig {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCabalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCabalos(110);
            motor.setCilindros(3);
            motor.setModelo("TH-40");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean
    @Primary
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCabalos(180);
        motor.setCilindros(4);
        motor.setModelo("XPTO-1");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
