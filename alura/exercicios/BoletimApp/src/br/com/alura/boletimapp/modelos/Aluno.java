package br.com.alura.boletimapp.modelos;

// Classe que representa um aluno com nome, matrícula, três avaliações e média final
public class Aluno {
    private String nome;
    private String matricula;
    private int avaliacao1;
    private int avaliacao2;
    private int avaliacao3;
    private int media;

    // Construtor padrão da classe Aluno
    public Aluno() {
    }

    // Métod que calcula a média das três avaliações e retorna o resultado
    public double calcularMedia() {
        this.media = ((this.avaliacao1 + this.avaliacao2 + this.avaliacao3)) / 3;
        return this.media;
    }

    // Métod que imprime no console o boletim do aluno com base na média calculada
    public void mostrarBoletim() {
        if (this.media >= 70) {
            System.out.println("Aluno(a) " + nome + " - matrícula " + matricula + " - ficou com a média " + media + " e foi aprovado");
        } else {
            System.out.println("Aluno(a) " + nome + " - matrícula " + matricula + " - ficou com a média " + media + " e foi reprovado");
        }
    }

    // Getter e Setter para o atributo nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para o atributo matrícula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Getter e Setter para a avaliação 1
    public int getAvaliacao1() {
        return avaliacao1;
    }

    public void setAvaliacao1(int avaliacao1) {
        this.avaliacao1 = avaliacao1;
    }

    // Getter e Setter para a avaliação 2
    public int getAvaliacao2() {
        return avaliacao2;
    }

    public void setAvaliacao2(int avaliacao2) {
        this.avaliacao2 = avaliacao2;
    }

    // Getter e Setter para a avaliação 3
    public int getAvaliacao3() {
        return avaliacao3;
    }

    public void setAvaliacao3(int avaliacao3) {
        this.avaliacao3 = avaliacao3;
    }

    // Getter para a média (não há setter, pois a média é calculada)
    public int getMedia() {
        return media;
    }
}