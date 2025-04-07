/*
 * Programa simples de calculadora que realiza operações matemáticas básicas.
 * O usuário pode escolher entre SOMA, SUBTRAÇÃO, MULTIPLICAÇÃO, DIVISÃO ou FATORIAL.
 * - Para operações básicas (exceto fatorial), o programa solicita dois números inteiros.
 * - Para o fatorial, o programa solicita apenas um número e calcula seu fatorial.
 * O resultado da operação escolhida é exibido no terminal.
 */

package CalculadoraComFatorial;
import java.util.Scanner;
import java.lang.String;

public class CalculadoraComFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Selecione a operação desejada: FATORIAL, SOMA, SUBTRACAO, MULTIPLICACAO OU DIVISAO: ");
        String operation = scanner.nextLine();

        if (operation.equalsIgnoreCase("fatorial")) {
            System.out.print("Digite o número que deseja calcular o fatorial: ");
            int number = scanner.nextInt();
            int fatorial = 1;
            for (int i = 1; i <= number; i++) {
                fatorial *= i;
            }
            System.out.print("O fatorial de " + number + " é: " + fatorial);
        }
        else if (operation.equalsIgnoreCase("soma") || operation.equalsIgnoreCase("subtracao") || operation.equalsIgnoreCase("multiplicacao") || operation.equalsIgnoreCase("divisao"))
        {
            System.out.print("Digite o primeiro número: ");
            int number01 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int number02 = scanner.nextInt();
            scanner.nextLine();

            int soma = number01 + number02;
            int subtracao = number01 - number02;
            int multiplicacao = number01 * number02;
            double divisao = (double) number01 / number02;


            if ("soma".equalsIgnoreCase(operation)) {
                System.out.printf("A soma entre %d e %d é igual à %d", number01, number02, soma);
            } else if ("subtracao".equalsIgnoreCase(operation)) {
                System.out.printf("A subtração entre %d e %d é igual à %d", number01, number02, subtracao);
            } else if ("multiplicacao".equalsIgnoreCase(operation)) {
                System.out.printf("O produto entre %d e %d é igual à %d", number01, number02, multiplicacao);
            } else if ("divisao".equalsIgnoreCase(operation)) {
                System.out.printf("A divisão entre %d e %d é igual à %f", number01, number02, divisao);
            } else {
                System.out.print("[ERRO] Tente novamente.");
            }
        }
    }
}


