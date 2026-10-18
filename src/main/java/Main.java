import exception.ContaNaoEncontradaException;
import exception.SaldoInsuficienteException;
import model.Banco;
import model.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaBancaria c1 = new ContaBancaria(1001);
        ContaBancaria c2 = new ContaBancaria(1002);

        banco.adicionarConta(c1);
        banco.adicionarConta(c2);

        try {
            ContaBancaria contaAchada = banco.buscarConta(1001);
            contaAchada.depositarValor(1500.00);
            contaAchada.sacarValor(300.00);
            contaAchada.imprimirExtrato();
        } catch (ContaNaoEncontradaException | SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println();

        try {
            ContaBancaria contaAchada = banco.buscarConta(1001);
            contaAchada.sacarValor(5000.00);
        } catch (ContaNaoEncontradaException | SaldoInsuficienteException e) {
            System.out.println("Erro esperado capturado: " + e.getMessage());
        }

        System.out.println();

        try {
            banco.buscarConta(9999);
        } catch (ContaNaoEncontradaException e) {
            System.out.println("Erro esperado capturado: " + e.getMessage());
        }
    }
}