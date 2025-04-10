import br.com.alura.screenmatch.modelos.Filme;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("Minecraft");
        favorito.setAnoDeLancamento(2025);
        favorito.setDuracaoEmMinutos(105);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());
    }

}
