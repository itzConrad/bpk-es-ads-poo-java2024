/* Implemente uma classe Aluno com atributos nome, matricula, e curso.
Adicione um método para calcular a média de notas.*/
import java.util.Scanner;
public class Aluno {
    String nome;
    int matricula;
    String curso;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    };

    public void infoAluno (){
        System.out.println("Nome: " + nome + "\nMatricula: " + matricula + "\nCurso: " + curso);
    };

    public void notasAluno (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeira nota");
        int nota = sc.nextInt();
        System.out.println("Segunda nota");
        int segunda = sc.nextInt();
        System.out.println("Terceira nota");
        int terceira = sc.nextInt();
        int media=0;

        media = (nota + segunda + terceira)/3;

        System.out.println("Media: " + media);
    };
}
