package br.com.pedrothecatholic.gestao_vagas.modules.candidate.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class ProfileCandidateResponseDTO {
    @Schema(example = "Desenvolvedora Java")
    private String description;

    @Schema(example = "maria")
    private String username;

    @Schema(example = "maria@gmail.com")
    private String email;
    private UUID id;

    @Schema(example = "Maria de Souza")
    private String name;
}
