package ConvertorDeTemperatura;

import java.util.Scanner;
public class ConvertorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a temperatura em graus pro usuário
        System.out.print("Digite a temperatura em graus Celcius: ");
        int grausCelcius = scanner.nextInt();

        //Conversor
        int grausFahrenheit = (int)((grausCelcius * 1.8) + 32);
                System.out.printf("%d graus Celsius é equivalente à %d graus Fahrenheit.", grausCelcius, grausFahrenheit);
    }
}
