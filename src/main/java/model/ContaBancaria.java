package model;

import exception.SaldoInsuficienteException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private int numero;
    private double saldo;
    private List<String> extrato = new ArrayList<>();

    public ContaBancaria(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    private String getDataFormatada() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return LocalDateTime.now().format(formatador);
    }

    public void depositarValor(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.extrato.add("Depósito de R$ " + valor + " em " + getDataFormatada());
        }
    }

    public void sacarValor(double valor) throws SaldoInsuficienteException {
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para essa transação!");
        }
        this.saldo -= valor;
        this.extrato.add("Saque de R$ " + valor + " em " + getDataFormatada());
    }

    public void imprimirExtrato() {
        System.out.println("=== EXTRATO BANCÁRIO (Conta " + this.numero + ") ===");
        for (String linha : this.extrato) {
            System.out.println(linha);
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }
}