package br.fiap.projeto.contexto.pagamento.adapter.controller;

import br.fiap.projeto.contexto.pagamento.adapter.controller.rest.port.IAtualizaPagamentoRestAdapterController;
import br.fiap.projeto.contexto.pagamento.adapter.controller.rest.port.IBuscaPagamentoRestAdapterController;
import br.fiap.projeto.contexto.pagamento.adapter.controller.rest.request.PagamentoDTORequest;
import br.fiap.projeto.contexto.pagamento.adapter.controller.rest.request.PagamentoStatusDTORequest;
import br.fiap.projeto.contexto.pagamento.adapter.controller.rest.response.PagamentoStatusDTOResponse;
import br.fiap.projeto.contexto.pagamento.usecase.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamento/retorno-gateway")
public class PagamentoRetornoGatewayPagamentoApiController {

    private final IAtualizaPagamentoRestAdapterController atualizaPagamentoRestAdapterController;
    private final IBuscaPagamentoRestAdapterController buscaPagamentoRestAdapterController;

    @Autowired
    public PagamentoRetornoGatewayPagamentoApiController(IAtualizaPagamentoRestAdapterController atualizaPagamentoRestAdapterController, IBuscaPagamentoRestAdapterController buscaPagamentoRestAdapterController) {
        this.atualizaPagamentoRestAdapterController = atualizaPagamentoRestAdapterController;
        this.buscaPagamentoRestAdapterController = buscaPagamentoRestAdapterController;
    }

    //INFO Vai simular a chegada do Código do Pedido e seu novo Status como resposta simulada do Gateway
    @Transactional
    @PatchMapping(value="/atualiza-status")
    public ResponseEntity<Void> atualizaStatusComRespostaDoGatewayPagamento(@RequestBody PagamentoStatusDTORequest pagamentoStatusDTORequest){
        try{
            buscaPagamentoRestAdapterController.findByCodigoPedido(pagamentoStatusDTORequest.getCodigoPedido());
        }catch(Exception e){
            throw new ResourceNotFoundException("Ocorreu um erro ao buscar o pagamento para o pedido: " + pagamentoStatusDTORequest.getCodigoPedido());
        }
        atualizaPagamentoRestAdapterController.atualizaStatusPagamento(new PagamentoDTORequest(pagamentoStatusDTORequest));
        return ResponseEntity.ok().build() ;
    }
}