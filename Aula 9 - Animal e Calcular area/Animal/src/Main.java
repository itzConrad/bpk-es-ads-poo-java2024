public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Jhoe", 21, "Medio");
        Gato gato = new Gato("Melissa", 3, "Amarelo, Preto e Marrom");

        System.out.println(cachorro);
        cachorro.latir();

        System.out.println(gato);
        gato.miar();


    }
}