package com.curso.arquiteturaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArquiteturaSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArquiteturaSpringApplication.class, args);
    }

}
/*
@SpringBootApplication
É uma anotação que combina três:
@Configuration → indica que a classe pode definir beans;
@EnableAutoConfiguration → ativa a configuração automática do Spring Boot;
@ComponentScan → faz o Spring procurar componentes (@Component, @Service, @Repository, @Controller) no mesmo pacote e subpacotes.
SpringApplication.run()
Cria o Spring Container (ApplicationContext);
Realiza o auto-configuration;
Faz o scan dos componentes;
Inicializa o servidor embutido (como Tomcat);
E então mantém a aplicação rodando.
 */