package exercicio17;

public class TesteAnimal {
    public static void main(String[] args) {
        exercicio17.Animal animal = new exercicio17.Animal("Urso", 6, 420);

        System.out.println(animal.alimentar());
        System.out.println(animal.dormir());
        System.out.println(animal.acordar());

        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade());
        System.out.println("Peso: " + animal.getPeso());
    }
}

