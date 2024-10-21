import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {
    private List<Pessoa> pessoas;

    public CadastroPessoa(){
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public List<Pessoa> listarPessoas(){
        return pessoas;
    }

    @Override
    public String toString() {
        return "CadastroPessoa{" +
                "pessoas=" + pessoas +
                '}';
    }
    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();
        Pessoa novaPessoa = new Pessoa("Arthur", 18);
        Endereco ondeMora = new Endereco("Centro", "Rua das Paineiras", "85935000", "Parana");
        Pessoa pessoa2 = new Pessoa("Fulano", 90);
        Endereco viaduto = new Endereco("Centro", "ponte", "38428-484", "Bahia");

        novaPessoa.incluirEndereco(ondeMora);
        cadastro.adicionarPessoa(novaPessoa);
        pessoa2.incluirEndereco(viaduto);
        cadastro.adicionarPessoa(pessoa2);

        System.out.println(cadastro.listarPessoas());
    }
}
