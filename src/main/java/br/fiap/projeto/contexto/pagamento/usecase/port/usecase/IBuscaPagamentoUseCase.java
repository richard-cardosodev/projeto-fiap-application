package br.fiap.projeto.contexto.pagamento.usecase.port.usecase;

import br.fiap.projeto.contexto.pagamento.entity.Pagamento;
import br.fiap.projeto.contexto.pagamento.entity.enums.StatusPagamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface IBuscaPagamentoUseCase {

    Page<Pagamento> findAll(Pageable pageable);

    Pagamento findByCodigo(UUID codigo);

    Page<Pagamento> findByStatusPagamento(StatusPagamento status, Pageable pageable);

    Pagamento findByCodigoPedido(String codigoPedido);


}
