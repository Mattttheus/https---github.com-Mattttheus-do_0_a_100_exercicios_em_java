package construtores;
/**
 *
 * @author Engº Matheus Vinicius 
 */
public class alunos {

 private double nota1;
 private double nota2;
 private double nota3;
 private double nota4;
 STATUS situacaoAluno;
 Matricula StuacaoMatricula;

  public alunos (double nota1,double nota2,double nota3,double nota4){

this.nota1 = nota1;
this.nota2 = nota2;
this.nota3 = nota3;
this.nota4 = nota4;
  }
  
  public enum STATUS{

  Aprovados,
  Reprovado 

  }
  public enum Matricula{

    Matriculado,
    Pendente,
    Recusado

  }
    public double media(){
   
    double mediaAluno =0;

    mediaAluno = (this.nota1 +this.nota2 +this.nota3+this.nota4)/4;
    
    return mediaAluno;
  
 }

}

    

