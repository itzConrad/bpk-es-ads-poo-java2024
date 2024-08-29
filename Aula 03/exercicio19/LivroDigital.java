package exercicio19;

public class LivroDigital {
    public String titulo;
    public String autor;
    public double tamanhoArquivo;
    public boolean aberto;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
        this.aberto = false;
    }

    public String abrirLivro() {
        if (!aberto) {
            aberto = true;
            return titulo + " foi aberto.";
        }
        return titulo + " já está aberto.";
    }

    public String fecharLivro() {
        if (aberto) {
            aberto = false;
            return titulo + " foi fechado.";
        }
        return titulo + " já está fechado.";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }
}
