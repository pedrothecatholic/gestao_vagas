package br.com.pedrothecatholic.gestao_vagas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.pedrothecatholic.gestao_vagas")
public class GestaoVagasApplication {
	public static void main(String[] args) {
		SpringApplication.run(GestaoVagasApplication.class, args);
	}

}
