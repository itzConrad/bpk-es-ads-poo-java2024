public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Felipe Neto", "Brasileiro");

        Livro livro1 = new Livro("Não faz Sentido", "9788577343935");
        Livro livro2 = new Livro("O Mundo Segundo Felipe Neto", "9788555462481");
        Livro livro3 = new Livro("Teste", "39284932894820");

        autor.escreverLivro(livro1);
        autor.escreverLivro(livro2);
        autor.escreverLivro(livro3);

        System.out.println(autor);
    }
}
