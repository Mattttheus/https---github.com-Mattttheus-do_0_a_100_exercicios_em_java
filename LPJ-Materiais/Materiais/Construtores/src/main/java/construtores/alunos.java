
package construtores;

/**
 *
 * @author theus
 */
public class alunos {

 private double nota1;
 private double nota2;
 private double nota3;
 private double nota4;
 STATUS situacaoAluno;

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
    
    public double media(){
   
   double mediaAluno =0;

    mediaAluno = (this.nota1 +this.nota2 +this.nota3+this.nota4)/4;
    
    return mediaAluno;
  
}

}

    

