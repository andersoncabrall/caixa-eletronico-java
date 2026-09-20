import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        
        Usuario user = new Usuario();
        Scanner leitor = new Scanner(System.in);
        int resp = 0;
        double money = 0;
        
        while (true) {
            System.out.println("\n--------------------");
            System.out.println("1 - Deposito");
            System.out.println("2 - Extrato");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");
            
            resp = leitor.nextInt();
            
            switch (resp) {
                case 1:
                    System.out.print("Digite o valor do deposito: R$ ");
                    money = leitor.nextDouble();
                    user.inserir(money);
                    break;
                    
                case 2:
                    System.out.println("Seu saldo atual e: R$ " + user.verExtrato());
                    break;
                    
                case 3:
                    System.out.print("Digite o valor do saque: R$ ");
                    money = leitor.nextDouble();
                    user.retirar(money);
                    break;
                    
                case 4:
                    System.out.println("Valeu, meu chefe! Ate a proxima.");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Opcao invalida! Tenta de novo.");
                    break;
            }
        }
    }
}
