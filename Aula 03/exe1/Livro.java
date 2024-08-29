package exe1;
import java.util.Random;

public class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void leituraPagina (){
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Numero de Paginas: " + numeroDePaginas);
    };

    public void lerPagina(){
        Random rand = new Random();
        int randomico = rand.nextInt(numeroDePaginas);
        System.out.println("Pagina: " + randomico);
    }

}
