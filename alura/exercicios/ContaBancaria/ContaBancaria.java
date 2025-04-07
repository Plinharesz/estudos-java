// Importando a classe Scanner para leitura de dados do usuário
package ContaBancaria;
import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo os dados iniciais do cliente
        String nomeCliente = "Pedro Linhares";
        String tipoConta = "Conta Corrente";
        int saldoInicial = 2500;
        int saldo = saldoInicial;

        // Exibindo os dados da conta bancária na tela
        System.out.println("**************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldoInicial + ".");
        System.out.println("**************");


        int operacao = 0;

        // Menu de operações disponíveis para o cliente
        String menu = """
                \nDigite a operação que deseja realizar:
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;

        // Loop principal do sistema bancário. Ele continua até o usuário escolher sair (opção 4)
        while (operacao != 4) {
            System.out.println(menu);
            operacao = scanner.nextInt();

                // Consultar saldo
            if (operacao == 1) {
                System.out.print("Seu saldo é de R$ " + saldo + ".");

                // Receber valor (depósito)
            } else if (operacao == 2) {
                System.out.println("Digite o valor a ser recebido: ");
                int valorRecebido = scanner.nextInt();
                saldo += valorRecebido;
                System.out.println("Transfência realizada com sucesso!");

                // Transferir valor (saque)
            } else if (operacao == 3) {
                System.out.println("Digite o valor a ser transferido: ");
                int valorTransferido = scanner.nextInt();

                // Verifica se há saldo suficiente para a transferência
                if (valorTransferido > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    System.out.println("Transferência realizada com sucesso!");
                    saldo -= valorTransferido;
                }

                // Encerrar o programa
            } else if (operacao == 4) {
                System.out.println("Obrigado por usar nosso sistema!");

                // Caso o usuário digite uma opção inválida
            } else {
                System.out.println("[ERRO] Digite um número válido");
            }
        }
    }
}

