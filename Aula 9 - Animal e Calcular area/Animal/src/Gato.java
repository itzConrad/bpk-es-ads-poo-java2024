public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void miar(){
        System.out.println("Miauh");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome= " + getNome() + '/' +
                "idade= " + getIdade() + '/' +
                "cor='" + cor + '\'' +
                '}';
    }
}
