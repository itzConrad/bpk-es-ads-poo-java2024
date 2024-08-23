/*Crie uma classe Professor com atributos nome, disciplina, e salario.
Adicione métodos para dar aula e corrigir provas.*/

public class Professor {
    String nome;
    String diciplina;
    double salario;

    public Professor(String nome, String diciplina, double salario) {
        this.nome = nome;
        this.diciplina = diciplina;
        this.salario = salario;
    }

    public void infoProfessor (){
        System.out.println("Nome: " + nome + "\nDiciplina: " + diciplina + "\nSalario: " + salario);
    };

    public void iProfessor (){
        System.out.println("Hoje falaremos sobre " + diciplina);
    }
    public void provasCorrigir (){
        System.out.println("Provas corrigidas, turma inteira com 100");
    }
}
