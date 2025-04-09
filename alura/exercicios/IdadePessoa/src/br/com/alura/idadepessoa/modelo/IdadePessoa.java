package br.com.alura.idadepessoa.modelo;

// Classe que representa uma pessoa com nome e idade
public class IdadePessoa {

    // Atributo que armazena o nome da pessoa
    private String nome;

    // Atributo que armazena a idade da pessoa
    private int idade;

    // Construtor vazio que permite criar o objeto sem definir os valores inicialmente
    public IdadePessoa() {
    }

    // Construtor que recebe nome e idade como parâmetros
    public IdadePessoa(String nome, int idade) {
    this.nome = nome;
     this.idade = idade;
    }

    // Retorna o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Define o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna a idade da pessoa
    public int getIdade() {
        return idade;
    }

    // Define a idade da pessoa
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Verifica se a pessoa é maior de idade (18 anos ou mais) e imprime o resultado
    public void verificarIdade() {
        if (idade < 18) {
            System.out.println(nome + " é menor de idade");
        } else {
            System.out.println(nome + " é maior de idade");
        }
    }
}
