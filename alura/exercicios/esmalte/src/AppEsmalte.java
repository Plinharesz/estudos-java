import br.com.alura.esmalte.modelos.Esmalte;
import java.util.ArrayList;
import java.util.List;

public class AppEsmalte {
    public static void main(String[] args) {

        List<Esmalte> catalogo = new ArrayList<>();

        // Lista com os dados dos esmaltes
        String[][] dadosEsmaltes = {
                {"Esmalterapia", "Azul", "Risqué", "Cintilante", "1"},
                {"A.Mar", "Azul", "Risqué", "Cremoso", "1"},
                {"Leo mandou flores", "Rosa", "Risqué", "Cremoso", "1"},
                {"Ski Boots", "Roxo", "Dailus", "Metálico", "1"},
                {"Noite quente", "Roxo", "Colorama", "Cremoso", "1"},
                {"Café Café", "Vinho", "Impala", "Cremoso", "1"},
                {"Rosa Antigo", "Rosa", "Colorama", "Cremoso", "1"},
                {"Sossego", "Rosa", "Impala", "Cremoso", "1"},
                {"É a Boiadeira", "Rosa", "Impala", "Cremoso", "1"},
                {"Carmim", "Vermelho", "Risqué", "Cremoso", "1"},
                {"Marilyn", "Rosa", "Impala", "Cremoso", "1"},
                {"Maçã do Amor", "Vermelho", "Risqué", "Metálico", "1"},
                {"Turmalina", "Roxo", "Risqué", "Cremoso", "1"},
                {"Amarelindo", "Amarelo", "Risqué", "Cremoso", "1"},
                {"Cranky Cactus", "Verde", "Dailus", "Cremoso", "1"},
                {"Branco Purissimo", "Branco", "Risqué", "Cremoso", "1"},
                {"Eu sou esse glamour todo", "Preto", "Risqué", "Cremoso", "1"},
                {"Rebel Rose", "Rosa", "Dailus", "Cremoso", "1"},
                {"Platino", "Branco", "Risqué", "Cintilante", "1"},
                {"Paris", "Branco", "Risqué", "Cremoso", "1"},
        };

        // Criando objetos com base nos dados
        for (String[] dados : dadosEsmaltes) {
            Esmalte esmalte = new Esmalte();
            esmalte.setNome(dados[0]);
            esmalte.setCor(dados[1]);
            esmalte.setMarca(dados[2]);
            esmalte.setAcabamento(dados[3]);
            esmalte.setQuantidade(Integer.parseInt(dados[4]));
            catalogo.add(esmalte);
        }

        // Exibindo o catálogo
        for (Esmalte esmalte : catalogo) {
            esmalte.exibirCatalogoEsmalte();
        }
    }
}