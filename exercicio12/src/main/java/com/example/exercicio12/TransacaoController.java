package com.example.exercicio12;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    private final TransacoesService transacoesService;

    public TransacaoController(TransacoesService transacoesService) {
        this.transacoesService = transacoesService;
    }

    @PostMapping
    public ResponseEntity<TransacaoResponseDTO> gerarTransacao(@RequestBody TransacaoRequestDTO requestDTO) {
        Transacao transacao = transacoesService.realizarTransacao(requestDTO.origem(), requestDTO.destino(), requestDTO.valor());

        ContaDTO origemDTO = ContaMapper.toContaDTO(transacao.getOrigem());
        ContaDTO destinoDTO = ContaMapper.toContaDTO(transacao.getDestino());

        TransacaoResponseDTO responseDTO = new TransacaoResponseDTO(origemDTO, destinoDTO, transacao.getValor());

        return ResponseEntity.ok(responseDTO);
    }
}
