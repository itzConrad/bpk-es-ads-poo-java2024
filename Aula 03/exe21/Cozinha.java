package Exercicio21;

public class Cozinha {
    public Integer quantidadePessoas;
    public String cor;

    public Cozinha(Integer quantidadePessoas, String cor ) {
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public void cozinhar(){
        System.out.println("Cozinhando...");
    }
    public void limpar(){
        System.out.println("Limpando...");
    }

    @Override
    public String toString() {
        return "Cozinha{" +
                "quantidadePessoas=" + quantidadePessoas +
                ", cor='" + cor + '\'' +
                '}';
    }
}
