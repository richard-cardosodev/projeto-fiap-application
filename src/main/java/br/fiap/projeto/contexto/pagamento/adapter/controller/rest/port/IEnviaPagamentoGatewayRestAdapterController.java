package br.fiap.projeto.contexto.pagamento.adapter.controller.rest.port;

import br.fiap.projeto.contexto.pagamento.adapter.controller.rest.request.PagamentoAEnviarAoGatewayDTORequest;

public interface IEnviaPagamentoGatewayRestAdapterController {

    void enviaParaGatewayDePagamento(PagamentoAEnviarAoGatewayDTORequest pagamentoAEnviarAoGatewayDTORequest);

    PagamentoAEnviarAoGatewayDTORequest preparaParaEnviarPagamentoAoGateway(PagamentoAEnviarAoGatewayDTORequest pagamentoAEnviarAoGatewayDTORequest);

}
