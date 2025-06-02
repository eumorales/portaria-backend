package com.gilbertomorales.portaria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservaResponseDTO {

    private String id;
    private String itemId;
    private String nomeItem;
    private String usuarioId;
    private String nomeUsuario;
    private String matriculaUsuario;
    private LocalDateTime dataReserva;
    private LocalDateTime dataRetirada;
    private LocalDateTime dataDevolucao;
    private String status; // RESERVADO, RETIRADO, DEVOLVIDO
}