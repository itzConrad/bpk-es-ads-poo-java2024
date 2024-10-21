package livros;

public class Pagina {
    private int numero;
    private String conteudo;

    public Pagina(int numero, String conteudo) {
        this.numero = numero;
        this.conteudo = conteudo;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}


