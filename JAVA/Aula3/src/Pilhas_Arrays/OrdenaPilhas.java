package Pilhas_Arrays;

import java.util.Arrays;

public class OrdenaPilhas {
	int[] elementos;

	public OrdenaPilhas(int[] elementos) {
		this.elementos = elementos;
	}

	public int[] ordenaPilhas() {

		int[] aux1 = new int[elementos.length];

		for (int i = 0; i < aux1.length; i++) {
			aux1[i] = elementos[i];
		}
		
		Arrays.sort(aux1);
		/*
		 * O método Arrays.sort() é uma função da classe utilitária Arrays do pacote
		 * java.util. Ele é usado para ordenar arrays de diversos tipos de dados, como
		 * int, double, String, entre outros.
		 */

		return aux1;

	}

}
