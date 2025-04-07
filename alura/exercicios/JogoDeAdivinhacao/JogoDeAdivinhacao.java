/*
Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte desafio:
Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:
//
Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop;

 */
package JogoDeAdivinhacao;
import java.util.Random;
import java.util.Scanner;
public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //
        System.out.println("""
                    JOGO DE ADIVINHAÇÃO - Acerte o número entre 1 e 100.
                -> Você tem 5 tentativas.""");

        int secretNumber = new Random().nextInt(100) + 1; // esse método gera um número de 0 a 99. Por isso o (+1) pra estar entre 1 e 100
        int palpite;
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.print("Faça seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == secretNumber) {
                System.out.println("Parabêns! Você acertou com "+ tentativas +" tentativa(s)");
                System.out.println("JOGO FINALIZADO");
                break;
            } else if (palpite > secretNumber ) {
                if (tentativas <= 4 ) { // Estrutura pra que no ultimo palpite, nao de o feedback se o numero é menor
                    System.out.println("ERROU! O número correto é MENOR");
                    }
            } else {
                if (tentativas <= 4) { // Estrutura pra que no ultimo palpite, nao de o feedback se o numero é maior
                    System.out.println("ERROU! O número correto é MAIOR");
                }
            }
                if (tentativas == 5) {
                    System.out.println("GAME OVER");
            }
        }

    }
}

