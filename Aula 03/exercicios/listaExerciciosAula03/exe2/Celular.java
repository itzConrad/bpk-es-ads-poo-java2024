package exe2;

import java.util.Scanner;

public class Celular {
    String marca;
    String modelo;
    int capacidadeDaBateria;

    public Celular(String marca, String modelo, int capacidadeDaBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeDaBateria = capacidadeDaBateria;
    };

    public void vendaCelular() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Bateria: " + capacidadeDaBateria);
    };

    public void sistemaCelular() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i == 0 ;) {
            System.out.println("Celular ligado!");
            System.out.println("Bateria: " + capacidadeDaBateria);
            capacidadeDaBateria -= 10;
            if (capacidadeDaBateria <= 0) {
                break;
            };
            System.out.println("Deseja desligar o celular? (S = 1/N = 0)");
            int botao = sc.nextInt();
            if (botao == 1) {
                break;
            };
        };
        System.out.println("Bip Bop.. Desligando..");
    };
};
