package Construtores;
public class aluno  {

private double nota01='5';
private double nota02 ='5';
private double nota03= '5';
private double nota04='5';
STATUS situacaoaluno;
Matricula SituacaoMatricula;

    public aluno(double nota01, double nota02, double nota03 ,double nota04){
		super();
		this.nota01 =nota01;
		this.nota02= nota02;
		this.nota03 = nota03;
        this.nota04 = nota04;
	}

    aluno() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

	
	public enum STATUS {
		 APROVADO,
	     REPROVADO
	} 
	public enum Matricula{

		Matriculado,
        Pendente,
	   Recusado		
	}

	public double calcularMediaAluno() {
		double mediaAluno = 0;
		mediaAluno = (this.nota01 + this.nota02 + this.nota03 +this.nota04)/4;
		return mediaAluno;
	}
}
