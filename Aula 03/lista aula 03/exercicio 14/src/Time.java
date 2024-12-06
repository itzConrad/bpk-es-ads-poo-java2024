import java.util.ArrayList;

public class Time {
    private String nome;
    private String tecnico;
    private ArrayList<String> jogadores;

    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(String jogador) {
        jogadores.add(jogador);
    }

    public void removerJogador(String jogador) {
        if (jogadores.contains(jogador)) {
            jogadores.remove(jogador);
        } else {
            System.out.println("O jogador " + jogador + " não está no time.");
        }
    }

    public void mostrarJogadores() {
        System.out.println("Jogadores do time " + nome + " Técnico " + tecnico + ": " + String.join(", ", jogadores));
    }

    public int numeroDeJogadores() {
        return jogadores.size();
    }
}