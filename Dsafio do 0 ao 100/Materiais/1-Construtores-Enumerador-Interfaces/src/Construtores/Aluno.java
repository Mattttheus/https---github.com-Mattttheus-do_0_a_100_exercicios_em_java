
package Construtores;

public class Aluno {
	// DEFININDO UM ENUMERADOR
	public enum STATUS {
		 APROVADO,
	     REPROVADO
	}
	private double nota1;
	private double nota2;
	private double nota3;
	
	public STATUS situacaoAluno;

	public Aluno(double nota1, double nota2, double nota3) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	// M�todo para calcular m�dia do aluno
	public double calcularMediaAluno() {
		double mediaAluno = 0;
		mediaAluno = (this.nota1 + this.nota2 + this.nota3) / 3;
		return mediaAluno;
	}
}
