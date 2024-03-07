package br.com.pedrothecatholic.gestao_vagas;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Gestão de Vagas",
                description = "API responsável pela gestão de vagas de emprego",
                version = "1"
        )
)
@ComponentScan("br.com.pedrothecatholic.gestao_vagas")
public class GestaoVagasApplication {
    public static void main(String[] args) {
        SpringApplication.run(GestaoVagasApplication.class, args);
    }

}
