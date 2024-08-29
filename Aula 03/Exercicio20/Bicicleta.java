package Exercicio20;

public class Bicicleta {
    public String marca;
    public String modelo;
    public String tamanhoRoda;

    public Bicicleta(String marca, String modelo, String tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }
    public void pedalar(){
        System.out.println("Pedalando...");
    }
    public void frear(){
        System.out.println("Freando...");
    }
    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanhoRoda=" + tamanhoRoda +
                '}';
    }
}

