package br.com.alura.esmalte.modelos;

public class Esmalte {
    private String nome; // Nome do esmalte
    private String cor; // Cor base (vermelho, azul, roxo, etc)
    private String marca; // Marca do esmalte
    private String acabamento; // cremoso, metálico, glitter, etc
    private int quantidade; // Numero de vidros de esmalte

    public void exibirCatalogoEsmalte() {
        if (quantidade > 0) {

            System.out.println(nome + "   -> DISPONÍVEL! - " + quantidade + " vidros restantes");
            System.out.println("Cor base do esmalte: " + cor);
            System.out.println("Marca: " + marca);
            System.out.println("Perfil: " + acabamento);
            System.out.println("**********");
        } else {
            System.out.println("**********");
            System.out.println(nome + "INDISPONÍVEL! - ");
            System.out.println("Cor base do esmalte: " + cor);
            System.out.println("Marca: " + marca);
            System.out.println("Perfil: " + acabamento);
            System.out.println("**********");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}