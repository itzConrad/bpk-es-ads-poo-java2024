package Exercicio20;

public class TesteBicicleta {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Velox MY23", "Aro 29");
        System.out.println(bicicleta.toString());
        bicicleta.pedalar();
        bicicleta.frear();
    }
}
