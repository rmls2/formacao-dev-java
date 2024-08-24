package conta_banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConta;
        String agencia, nomeCliente;
        // double saldo = 100.00;

        System.out.println("Digite o numero da conta ");
        numeroConta = scanner.nextInt();
        System.out.println("Digite o numero da agencia ");
        agencia = scanner.next();
        System.out.println("digite o nome do cliente");
        nomeCliente = scanner.next();

        System.out.println("----------------------------------------------");

        System.out.println("Olá, " + nomeCliente + " sua agencia é " + agencia +  " o numero da sua conta é " + numeroConta );
    }   
}
