package livros;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private List<Pagina> paginas;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }

//    public void addPagina(String conteudo){
//        int numero = this.paginas.size() + 1;
//       Pagina pagina = new Pagina(numero, conteudo);
//       paginas.add(pagina);
//    }
    public void adicionarPagina(){

    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
