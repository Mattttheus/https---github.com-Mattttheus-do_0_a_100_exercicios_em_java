
package construtores;

/**
 *
 * @author Engº Matheus
 */
import java.util.Scanner;
import construtores.alunos.STATUS;
import construtores.alunos.Matricula;

public class construtores {

   /**
    * @param args
    */
   public static void main(String[] args) {

      @SuppressWarnings("resource")
      Scanner imput = new Scanner(System.in);

      System.out.println("Digita a sua Primeira Nota ");
      double nota1 = imput.nextDouble();

      System.out.println("Digita a sua Segunda  Nota ");
      double nota2 = imput.nextDouble();

      System.out.println("Digita a sua Terceira Nota ");
      double nota3 = imput.nextDouble();

      System.out.println("Digita a sua Quarta Nota ");
      double nota4 = imput.nextDouble();

      alunos alu = new alunos(nota1, nota2, nota3, nota4);

      double mediaAluno = alu.media();

      if (mediaAluno < 6) {

         alu.situacaoAluno = STATUS.Reprovado;
         alu.StuacaoMatricula = Matricula.Matriculado;

      } else if (mediaAluno < 8) {

         alu.situacaoAluno = STATUS.Aprovados;
         alu.StuacaoMatricula = Matricula.Pendente;
      } else {

         alu.situacaoAluno = STATUS.Aprovados;
         alu.StuacaoMatricula = Matricula.Matriculado;
      }
      System.out.println(" A Media do Aluno é  " + alu.media() + " e a Situação e   " + alu.situacaoAluno);

      System.out.println("O Aluno pode esta " + alu.StuacaoMatricula);
   }

}
