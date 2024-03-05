package br.com.pedrothecatholic.gestao_vagas.modules.candidate.config;

import br.com.pedrothecatholic.gestao_vagas.modules.candidate.useCases.ProfileCandidateUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CandidateConfig {
    @Bean
    public ProfileCandidateUseCase profileCandidateUseCase() {
        return new ProfileCandidateUseCaseImpl(); // Implementação concreta
    }
}
