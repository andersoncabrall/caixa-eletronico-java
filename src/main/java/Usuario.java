public class Usuario {
    private double saldo = 0;
    
    public double verExtrato() {
        return this.saldo;
    }
    
    public void inserir(double dinheiro) {
        if (dinheiro > 0) {
            this.saldo += dinheiro;
            System.out.println("Beleza! Foi depositado R$ " + dinheiro + " e voce tem na conta R$ " + verExtrato());
        } else {
            System.out.println("Deu errado aí meu chefe! Valor de deposito invalido.");
        }
    }
    
    public void retirar(double dinheiro) {
        if (dinheiro > this.saldo || dinheiro <= 0) {
            System.out.println("Deu errado aí meu chefe! Saldo insuficiente ou valor invalido.");
        } else {
            this.saldo -= dinheiro;
            System.out.println("Beleza! Foi sacado R$ " + dinheiro + " e voce tem na conta R$ " + verExtrato());
        }
    }
}
