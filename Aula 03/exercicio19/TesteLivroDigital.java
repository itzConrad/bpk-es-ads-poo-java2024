package exercicio19;

public class TesteLivroDigital {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("O Senhor dos Anéis", "J.R.R. Tolkien", 1.5);

        System.out.println(livro.abrirLivro());
        System.out.println(livro.fecharLivro());

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Tamanho do Arquivo: " + livro.getTamanhoArquivo() + " MB");
    }
}

