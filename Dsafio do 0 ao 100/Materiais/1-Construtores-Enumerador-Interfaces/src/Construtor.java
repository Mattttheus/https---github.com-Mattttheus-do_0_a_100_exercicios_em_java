import Construtores.Aluno;
import Construtores.Aluno.STATUS;

public class Construtor {

	/**
	 * @param <String>
	 * @param args
	 * @param System 
	 */
	public static <String> void main(String[] args, Object System) {

		Aluno alu = new Aluno( 8,  8,  8);
		
		double mediaAlunoFinal = alu.calcularMediaAluno();
		
		
		if (mediaAlunoFinal < 6 ) {
			alu.situacaoAluno = STATUS.REPROVADO;
		} else {
			alu.situacaoAluno = STATUS.APROVADO;
		}
		
		// imprimindo situa��o do aluno
		System.out.println("A m�dia do aluno � : " + alu.calcularMediaAluno() + " e o aluno est� " + alu.situacaoAluno);
	}
}