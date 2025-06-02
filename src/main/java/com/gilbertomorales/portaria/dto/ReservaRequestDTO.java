package com.gilbertomorales.portaria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservaRequestDTO {

    @NotBlank(message = "ID do item obrigatório")
    private String itemId;

    @NotBlank(message = "Matrícula do usuário é obrigatória")
    private String matriculaUsuario;
}