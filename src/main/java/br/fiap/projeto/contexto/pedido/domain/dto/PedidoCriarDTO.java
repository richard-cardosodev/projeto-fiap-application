package br.fiap.projeto.contexto.pedido.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoCriarDTO {
    private UUID cliente;
}
