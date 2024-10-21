public class Cachorro extends Animal{
    private String porte;

    public Cachorro(String nome, int idade, String porte) {
        super(nome, idade);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public void latir (){
        System.out.println("Au au");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome= " + getNome() + '/' +
                "idade= " + getIdade() + '/' +
                "porte='" + porte + '\'' +
                '}';
    }
}
