import br.com.alura.idadepessoa.modelo.IdadePessoa;

public class AppIdadePessoa {
    public static void main(String[] args) {

        // Criação de um objeto da classe IdadePessoa usando o construtor com parâmetros
        IdadePessoa pessoa01 = new IdadePessoa("Pedro", 23);
        pessoa01.verificarIdade(); // Verifica e imprime se Pedro é maior ou menor de idade

        // Criação de um objeto da classe IdadePessoa usando o construtor vazio
        IdadePessoa pessoa02 = new IdadePessoa();
        pessoa02.setNome("Maria"); // Define o nome como Maria
        pessoa02.setIdade(23);     // Define a idade como 23
        pessoa02.verificarIdade(); // Verifica e imprime se Maria é maior ou menor de idade
    }
}