package model;

import exception.ContaNaoEncontradaException;
import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<Integer, ContaBancaria> contas = new HashMap<>();

    public Map<Integer, ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(Map<Integer, ContaBancaria> contas) {
        this.contas = contas;
    }

    public void adicionarConta(ContaBancaria conta) {
        int numero = conta.getNumero();
        this.contas.put(numero, conta);
    }

    public ContaBancaria buscarConta(int numero) throws ContaNaoEncontradaException {
        ContaBancaria conta = this.contas.get(numero);
        if (conta == null) {
            throw new ContaNaoEncontradaException("Conta número " + numero + " não encontrada!");
        }
        return conta;
    }
}