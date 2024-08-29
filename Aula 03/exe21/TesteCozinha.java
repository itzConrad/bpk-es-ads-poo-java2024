package Exercicio21;

public class TesteCozinha {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha(6, "Preto");
        System.out.println(cozinha.toString());
        cozinha.cozinhar();
        cozinha.limpar();
    }
}
