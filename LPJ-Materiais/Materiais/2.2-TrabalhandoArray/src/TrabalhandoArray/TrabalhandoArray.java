package 	TrabalhandoArray;

import javax.swing.JOptionPane;

public class TrabalhandoArray {

	public static void main(String[] args) {
		//declarando o array
		String [] paises = new String[5];
		 
		// inicializando o array
		paises[0] = "Brasil";
		paises[1] = "Alemanha";
		paises[2] = "It�lia";
		paises[3] = "�ustria";
		paises[4] = "Pol�nia";

		for (String lista: paises) {
			System.out.println(lista);
		}
		// inserindo dados no array
		int [] numeros = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		}
		// listando os valores do array com um ForEach
		System.out.println("Ap�s a entrada de dados");
		for (int listaNumeros : numeros) {
			System.out.print(listaNumeros + " ");
		}
		// calculando os valores para armazenar no array
		numeros[8] = numeros[7] + 4;
		System.out.println("\nAp�s a altera��o do valor na posi��o 8");
		// listando os valores do array com um ForEach
		for (int listaNumeros : numeros) {
			System.out.print(listaNumeros + " ");
		}
	}

}
