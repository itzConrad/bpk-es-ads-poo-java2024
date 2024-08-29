package exercicio16;

public class TesteLoja {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja("Loja Americanas", "Rua Vieira do Santos , 555", "(44) 997519391");

        System.out.println(minhaLoja.abrirLoja());
        System.out.println(minhaLoja.abrirLoja());
        System.out.println(minhaLoja.fecharLoja());
        System.out.println(minhaLoja.fecharLoja());

        System.out.println("Nome da Loja: " + minhaLoja.getNome());
        System.out.println("Endereço: " + minhaLoja.getEndereco());
        System.out.println("Telefone: " + minhaLoja.getTelefone());
    }
}
