package br.fiap.projeto.contexto.pagamento.external.repository.postgres;

import br.fiap.projeto.contexto.pagamento.entity.Pagamento;
import br.fiap.projeto.contexto.pagamento.entity.enums.StatusPagamento;
import br.fiap.projeto.contexto.pagamento.external.repository.entity.PagamentoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SpringPagamentoRepository extends JpaRepository<PagamentoEntity, UUID> {
    PagamentoEntity findByCodigoPedido(String codigoPedido);

    PagamentoEntity findByCodigo(UUID codigo);

    List<PagamentoEntity> findByStatusPagamento(StatusPagamento status);

    List<PagamentoEntity> findAll();

    void save(Pagamento pagamento);

}