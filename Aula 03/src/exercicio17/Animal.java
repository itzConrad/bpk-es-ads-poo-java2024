package exercicio17;

public class Animal {
    public String especie;
    public int idade;
    public int peso;
    public boolean alimentado;
    public boolean dormindo;

    public Animal(String especie, int idade, int peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.alimentado = false;
        this.dormindo = false;
    }

    public String alimentar() {
        if (!alimentado) {
            alimentado = true;
            return especie + " está se alimentando.";
        }
        return especie + " já está alimentado.";
    }

    public String dormir() {
        if (!dormindo) {
            dormindo = true;
            return especie + " está dormindo.";
        }
        return especie + " já está dormindo.";
    }

    public String acordar() {
        if (dormindo) {
            dormindo = false;
            return especie + " acordou.";
        }
        return especie + " já está acordado.";
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public int getPeso() {
        return peso;
    }
}
