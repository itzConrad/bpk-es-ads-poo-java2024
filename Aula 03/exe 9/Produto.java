

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public void infoProduto(){
        System.out.println("Nome: " + nome + "Preço: " + preco + "Quantidade do estoque: " + quantidadeEstoque);

    }
    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
        } else {
            System.out.println("Quantidade inválida para aumentar o estoque.");
        }
    }
    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Quantidade inválida para diminuir o estoque.");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Produto
        Produto produto = new Produto("Notebook", 2500.00, 10);
        System.out.println(produto);

        produto.aumentarEstoque(5);
        System.out.println("Após aumentar o estoque: " + produto);

        produto.diminuirEstoque(3);
        System.out.println("Após diminuir o estoque: " + produto);
    }
}
