package Construtores;

import Construtores.aluno.STATUS;
import Construtores.aluno.Matricula;;

public class Construtor {

	public static void main(String[] args) {
		// passando os dados atrav�s do construtor com sobrecarga
		aluno alu = new aluno();
		// calculando a m�dia
		double mediaAlunoFinal = alu.calcularMediaAluno();

		// definindo situa��o do aluno
		if (mediaAlunoFinal < 6) {
			alu.situacaoaluno = STATUS.REPROVADO;
			alu.SituacaoMatricula = Matricula.Pendente;

		} else if (mediaAlunoFinal < 8) {
			alu.situacaoaluno = STATUS.APROVADO;
			alu.SituacaoMatricula = Matricula.Matriculado;

		} else {

			alu.SituacaoMatricula = Matricula.Recusado;
		}

		// imprimindo situa��o do aluno
		System.out.println("A media do aluno � : " + alu.calcularMediaAluno() + " e o aluno est� " + alu.situacaoaluno);

		System.out.println("  O Aluno pode esta com a Matricula  " + alu.SituacaoMatricula);
	}
}
