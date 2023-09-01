package br.fiap.projeto.contexto.comanda.usecase.port.repositoryInterface;

import br.fiap.projeto.contexto.comanda.entity.Comanda;
import br.fiap.projeto.contexto.comanda.external.exception.ExceptionMessage;
import lombok.SneakyThrows;

public interface ICriarComandaRepositoryUseCase {

    Comanda criar(Comanda comanda) throws ExceptionMessage;

}
