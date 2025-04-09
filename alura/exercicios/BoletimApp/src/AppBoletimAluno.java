import br.com.alura.boletimapp.modelos.Aluno;

/**
 * Classe principal para demonstrar o uso da classe Aluno.
 * Simula a criação de alunos, inserção de notas, cálculo de média e exibição do boletim.
 */
public class AppBoletimAluno {
    public static void main(String[] args) {

        // Criação do primeiro aluno e definição de suas informações e notas
        Aluno aluno01 = new Aluno();
        aluno01.setNome("Pedro");
        aluno01.setMatricula("12418821");
        aluno01.setAvaliacao1(70);
        aluno01.setAvaliacao2(70);
        aluno01.setAvaliacao3(90);
        aluno01.calcularMedia();
        aluno01.mostrarBoletim();

        // Criação do segundo aluno e definição de suas informações e notas
        Aluno aluno02 = new Aluno();
        aluno02.setNome("Maria");
        aluno02.setMatricula("12418822");
        aluno02.setAvaliacao1(80);
        aluno02.setAvaliacao2(60);
        aluno02.setAvaliacao3(10);
        aluno02.calcularMedia();
        aluno02.mostrarBoletim();
    }
}