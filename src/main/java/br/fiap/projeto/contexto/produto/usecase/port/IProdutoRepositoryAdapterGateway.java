package br.fiap.projeto.contexto.produto.usecase.port;

import br.fiap.projeto.contexto.produto.entity.Produto;
import br.fiap.projeto.contexto.produto.entity.enums.CategoriaProduto;
import br.fiap.projeto.contexto.produto.usecase.exception.EntradaInvalidaException;

import java.util.List;
import java.util.Optional;

public interface IProdutoRepositoryAdapterGateway {
    public List<Produto> buscaTodos();

    public Optional<Produto> buscaProduto(String codigo);

    public List<Produto> buscaProdutosPorCategoria(CategoriaProduto categoria);

    public Produto criaProduto(Produto produto) throws EntradaInvalidaException;

    public void removeProduto(String codigo);

    public void atualizaProduto(Produto produto);
}
