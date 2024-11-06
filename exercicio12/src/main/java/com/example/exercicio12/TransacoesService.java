package com.example.exercicio12;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransacoesService {
    private List<Conta> contas;

    public TransacoesService() {
        this.contas = new ArrayList<>();
        contas.add(new Conta("500-1", "Deivyd", 1000.0));
        contas.add(new Conta("320-2", "Lula", 500.0));
    }

    public Optional<Conta> buscarContaPorCodigo(String codigo) {
        return contas.stream()
                .filter(conta -> conta.getCodigo().equals(codigo))
                .findFirst();
    }

    public Transacao realizarTransacao(String origemCodigo, String destinoCodigo, Double valor) {
        Conta origem = buscarContaPorCodigo(origemCodigo).orElseThrow(() -> new IllegalArgumentException("com.banco.transfer.Conta de origem não encontrada"));
        Conta destino = buscarContaPorCodigo(destinoCodigo).orElseThrow(() -> new IllegalArgumentException("com.banco.transfer.Conta de destino não encontrada"));

        if (origem.getSaldo() < valor) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        origem.setSaldo(origem.getSaldo() - valor);
        destino.setSaldo(destino.getSaldo() + valor);

        return new Transacao(origem, destino, valor);
    }
}
