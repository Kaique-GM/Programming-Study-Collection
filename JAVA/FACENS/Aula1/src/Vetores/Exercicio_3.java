package Vetores;

public class Exercicio_3 {
	/*
	 * Crie um método que receba como parâmetro um número binário na forma de um
	 * vetor com 8 posições e retorne esse número convertido para decimal.
	 */

	public static void main(String[] args) {

		int[] binario = new int[] { 0, 0, 0, 0, 1, 0, 0, 0 }; // = 8
		converterBin1(binario);
		converterBin2(binario);
		
	}

	public static int converterBin1(int[] binario) {
		int numero = 0;
		for (int i = 0; i < binario.length; i++) {
			numero = numero * 10 + binario[i];
		}
		int binaryInt = numero;
		String binaryString = Integer.toString(binaryInt);
		int decimal = Integer.parseInt(binaryString, 2);
		System.out.println("Método 1 : O número decimal é: " + decimal);
		return numero;
	}
	// ou
	public static int converterBin2(int[] bits) {
	    int numero = 0;
	    for (int i = 0; i < bits.length; i++) {
	        numero = numero * 2 + bits[i];
	    }
	    System.out.println("Método 2 : O número decimal é: " + numero);
	    return numero;
	}
}
