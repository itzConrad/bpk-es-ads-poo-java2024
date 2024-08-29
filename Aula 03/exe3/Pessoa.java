/* 3 - Implemente uma classe Pessoa com atributos nome, idade, e altura.
Adicione um método que imprime uma apresentação da pessoa.*/

public class Pessoa {
    String nome;
    int idade;
    double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    };

    public void gerarPessoa (){
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);
    };

    public void dizerOla(){
        System.out.println("Ola Mundo, eu me chamo " + nome + "\nfui criado computograficamente, entao nao sou real\n" + "mas se eu fosse real, teria " + altura + "de altura" + " e teria " + idade + " de idade. \nAgora tenho que ir, tchau!");
    };
};
