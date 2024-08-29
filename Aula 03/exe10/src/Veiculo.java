public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void abastecer() {
        System.out.println("O veículo foi abastecido.");
    }
    public void lavar() {
        System.out.println("O veículo foi lavado.");
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Veiculo
        Veiculo veiculo = new Veiculo("Carro", "ABC-1234", "Preto");
        System.out.println(veiculo);

        veiculo.abastecer();
        veiculo.lavar();
    }
}

