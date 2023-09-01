package br.fiap.projeto.contexto.comanda.usecase.port.repositoryInterface;

import java.util.UUID;

import br.fiap.projeto.contexto.comanda.entity.Comanda;
import br.fiap.projeto.contexto.comanda.external.exception.ExceptionMessage;

public interface IAtualizarComandaRepositoryUseCase {

    Comanda atualizar(UUID codigoComanda) throws ExceptionMessage;

}
