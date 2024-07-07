/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construtores;

/**
 *
 * @author theus
 */
import java .util.Scanner;
import construtores.alunos.STATUS;

public class construtores {


   public static void main (String[] args){

    Scanner imput = new Scanner(System.in);
   
       System.out.println("Digita a sua Primeira Nota ");
       double nota1 = imput.nextDouble();

       System.out.println("Digita a sua Segunda  Nota ");
       double nota2 = imput.nextDouble();

       System.out.println("Digita a sua Terceira Nota ");
       double nota3 = imput.nextDouble();

       System.out.println("Digita a sua Quarta Nota ");
       double nota4 = imput.nextDouble();

       alunos alu = new alunos(nota1,nota2,nota3,nota4);
      
       double mediaAluno = alu.media();

  if(mediaAluno < 6){

   alu.situacaoAluno = STATUS.Reprovado;
   }else{

  alu.situacaoAluno= STATUS.Aprovados;
}
       System.out.println(" A Media do Aluno é  "  +  alu.media() + " e a Situação e   "  +  alu.situacaoAluno);
}

    
}
