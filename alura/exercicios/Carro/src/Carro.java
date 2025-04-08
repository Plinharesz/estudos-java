public class Carro {
    String modelo;
    String cor;
    int ano;

    void exibirFichaTecnica(){
        System.out.println("Modelo: " + modelo + " | cor: " + cor + " | ano: " + ano);
    }

    int calcularIdade(){
        return 2025 - ano;
    }
}
