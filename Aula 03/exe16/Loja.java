package exercicio16;


public class Loja {
    public String nome;
    public String endereco;
    public String telefone;
    public boolean aberta;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.aberta = false;
    }

    public String abrirLoja() {
        if (!aberta) {
            aberta = true;
            return nome + " está agora aberta.";
        }
        return nome + " já está aberta.";
    }

    public String fecharLoja() {
        if (aberta) {
            aberta = false;
            return nome + " foi fechada.";
        }
        return nome + " já está fechada.";
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}
