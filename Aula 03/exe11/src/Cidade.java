public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            this.populacao += quantidade;
        } else {
            System.out.println("Quantidade inválida para aumentar a população.");
        }
    }
    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0 && quantidade <= this.populacao) {
            this.populacao -= quantidade;
        } else {
            System.out.println("Quantidade inválida para diminuir a população.");
        }
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                ", estado='" + estado + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Cidade
        Cidade cidade = new Cidade("Curitiba", 1948626, "Paraná");
        System.out.println(cidade);

        cidade.aumentarPopulacao(500);
        System.out.println("Após aumentar a população: " + cidade);

        cidade.diminuirPopulacao(300);
        System.out.println("Após diminuir a população: " + cidade);
    }
}
