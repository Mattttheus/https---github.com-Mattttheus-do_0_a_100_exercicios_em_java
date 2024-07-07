package Embarque;

import java.util.Scanner;
import Embarque.Aeronaves;

public class Principal {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new Scanner(System.in);
	Aeronaves air = new Embarque.Aeronaves() {
		public void addVoo(Integer nrVoo) {}

		@Override
		public Integer primeiroVoo() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException("Unimplemented method 'primeiroVoo'");
		}

		@Override
		public void listaVoos() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException("Unimplemented method 'listaVoos'");
		};

	} 
	}
}
