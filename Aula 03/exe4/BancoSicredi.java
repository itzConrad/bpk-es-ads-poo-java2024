package exe4;/* Crie uma classe ContaBancaria com atributos como numeroConta e saldo.
Adicione métodos para depositar e sacar dinheiro.*/


import java.util.Scanner;

public class BancoSicredi {
    int idConta;
    int saldo;

    public BancoSicredi(int idConta, int saldo) {
        this.idConta = idConta;
        this.saldo = saldo;
    }

    ;

    public void caixaEletronico() {
        System.out.println("Conta: " + idConta + " Saldo: " + saldo);
    }

    ;

    public int sistemaInterno() {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i == 0; ) {
            System.out.println("Depositar - D | Sacar - S | Quit - Q");
            char choice = sc.next().charAt(0);
            switch (choice) {
                case 'D':
                    System.out.println("Digite o valor que deseja depositar");
                    int valor = sc.nextInt();
                    saldo = saldo + valor;
                    System.out.println("+" + valor);
                    System.out.println("Saldo: " + saldo);
                    break;
                case 'S':
                    System.out.println("Digite o valor que deseja sacar");
                    int valor2 = sc.nextInt();
                    if (saldo - valor2 < 0) {
                        System.out.println("Saldo insuficiente");
                        System.out.println("Saldo: " + saldo);
                        break;
                    } else {
                        saldo = saldo - valor2;
                        System.out.println("Dinheiro sacado com sucesso");
                        System.out.println("Saldo: " + saldo);
                        break;
                    }
                case 'Q':
                    System.out.println("Saindo..");
                    i = 1;
                    break;

                default:
                    break;
            }
            ;
        }
        return saldo;
    }

    ;
}
