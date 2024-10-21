import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Integer idade;
    private List<Endereco> enderecos;

    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade= idade;
        this.enderecos = new ArrayList<>();
    }

    public List<Endereco> incluirEndereco(Endereco endereco){
        enderecos.add(endereco);
        return enderecos;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", enderecos=" + enderecos +
                '}';
    }
}
