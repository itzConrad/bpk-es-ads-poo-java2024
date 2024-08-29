/*Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento.
Adicione métodos para ligar e desligar o computador.*/

import java.util.Scanner;

public class Computador {
    String processador;
    int memoriaRAM;
    int armazenamento;

    public Computador(String processador, int memoriaRAM, int armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    ;

    public void Pc() {
        System.out.println("Processador: " + processador + ", Memoria RAM: " + memoriaRAM + "GB" + ", Armazenamento: " + armazenamento + "GB");

    }

    ;

    public void onOff() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i == 0; ) {
            System.out.println("L - Ligar | D - Desligar");
            char botao = sc.next().charAt(0);
            switch (botao) {
                case 'L':
                    System.out.println("Computador Ligado..");
                    break;
                case 'D':
                    System.out.println("Computador Desligando..");
                    i = 1;
                    break;
                default:
                    break;
            }
        }
    }

    ;
}
