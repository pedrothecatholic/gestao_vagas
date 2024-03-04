package br.com.pedrothecatholic.gestao_vagas.modules.candidate.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class ProfileCandidateResponseDTO {
    private String description;
    private String username;
    private String email;
    private UUID id;
    private String name;
}
