package Exercicio22;

public class Empresa {
    public String nome;
    public String cnpj;
    public Integer numeroFuncionarios;

    public Empresa(String nome, String cnpj, Integer numeroFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratar(){
        System.out.println("Contratado");
    }
    public void demitir(){
        System.out.println("Demitido");
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", numeroFuncionarios=" + numeroFuncionarios +
                '}';
    }
}
