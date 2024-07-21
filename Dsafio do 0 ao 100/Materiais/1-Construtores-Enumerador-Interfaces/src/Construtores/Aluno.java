
package Construtores;
import Construtores.Aluno.STATUS;
public class Aluno {
	private double nota1;
	private double nota2;
	private double nota3;
	STATUS situacaoAluno;
	
	public Aluno(double nota1, double nota2, double nota3) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	// DEFININDO UM ENUMERADOR
	public enum STATUS {
		 APROVADO,
	     REPROVADO
	}

	// M�todo para calcular m�dia do aluno
	public double calcularMediaAluno() {
		double mediaAluno = 0;
		mediaAluno = (this.nota1 + this.nota2 + this.nota3) / 3;
		return mediaAluno;
	}
}
