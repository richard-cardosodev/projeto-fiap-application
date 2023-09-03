package br.fiap.projeto.contexto.pedido.usecase.port.usecase;

import br.fiap.projeto.contexto.pedido.entity.Pedido;
import br.fiap.projeto.contexto.pedido.usecase.exception.IntegrationProdutoException;
import br.fiap.projeto.contexto.pedido.usecase.exception.InvalidOperacaoProdutoException;
import br.fiap.projeto.contexto.pedido.usecase.exception.ItemNotFoundException;

import java.util.UUID;

public interface IPedidoManagementUseCase {
    Pedido criaPedido(String codigoCliente);
    Pedido adicionarProduto(UUID codigoPedido, UUID codigoProduto) throws InvalidOperacaoProdutoException, ItemNotFoundException, IntegrationProdutoException;
    Pedido aumentarQuantidade(UUID codigoPedido, UUID codigoProduto) throws ItemNotFoundException, InvalidOperacaoProdutoException;
    Pedido reduzirQuantidade(UUID codigoPedido, UUID codigoProduto) throws ItemNotFoundException, InvalidOperacaoProdutoException;
    void removerProduto(UUID codigoPedido, UUID codigoProduto) throws InvalidOperacaoProdutoException, ItemNotFoundException;
}
