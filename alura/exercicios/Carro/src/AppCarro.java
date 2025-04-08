/*
Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
 */

public class AppCarro {
    public static void main(String[] args) {

        Carro car01 = new Carro();
        Carro car02 = new Carro();
        Carro car03 = new Carro();

        car01.modelo = "Ferrari Spider";
        car02.modelo = "BMW M3";
        car03.modelo = "Volkswagen Golf";

        car01.ano = 2024;
        car02.ano = 2019;
        car03.ano = 2005;

        car01.cor = "Vermelho";
        car02.cor = "Cinza";
        car03.cor = "Azul";

        car01.exibirFichaTecnica();
        car02.exibirFichaTecnica();
        car03.exibirFichaTecnica();

        System.out.println("Idade do carro 01: " + car01.calcularIdade() + " anos");
        System.out.println("Idade do carro 02: " + car02.calcularIdade() + " anos");
        System.out.println("Idade do carro 03: " + car03.calcularIdade() + " anos");

    }
}