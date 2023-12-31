package br.fiap.projeto.contexto.pedido.usecase.port.usecase;

import br.fiap.projeto.contexto.pedido.entity.Pedido;

import java.util.List;
import java.util.UUID;

public interface IPedidoQueryUseCase {
    Pedido buscaPedido(UUID codigoPedido);
    List<Pedido> buscaTodos();
    List<Pedido> buscarTodosRecebido();
    List<Pedido> buscarTodosPagos();
    List<Pedido> buscarTodosEmPreparacao();
    List<Pedido> buscarTodosPronto();
    List<Pedido> buscarTodosFinalizado();
    List<Pedido> buscarTodosCancelado();
    List<Pedido> buscarTodosPorStatusEDataCriacao();
}
