/*Defina uma classe Cachorro com atributos nome, raca, e idade.
Adicione métodos para latir e correr.*/

import java.util.Scanner;
public class Cachorro {
    String nome;
    String raca;
    int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    };

    public void screenCachorro (){
        System.out.println("Nome: " + nome + "\nRaca: " + raca + "\nIdade: " + idade + " meses");
    };

    public void latir (){
        System.out.println("Au.. Au..");
    };

    public void correr(){
        Scanner sc = new Scanner(System.in);
        int kms = 10;


        for (int i = 0; i == 0 ;) {
            System.out.println("Comando para o cachorro");
            System.out.println("A - Latir | B - Correr | C - Chamar | D - Presente Misterioso | S - Ir para casa");
            char comandoVoice = sc.next().charAt(0);

            switch(comandoVoice){
                case 'A':
                    System.out.println("Au Au Au Au AUUUUh");
                    break;
                case 'B':
                    System.out.println(nome + " correu para longe");
                    break;
                case 'C':
                    System.out.println(nome + " volta aqui");
                    break;
                case 'D':

                    System.out.println("Voce: Ah merda, o " + nome + " deixou um presente no chao.");
                    break;

                case 'S':
                    System.out.println(nome + " vamos embora.");
                    i=1;
                    break;
            }

        }

    };
}
