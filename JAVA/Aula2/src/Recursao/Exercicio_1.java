package Recursao;

public class Exercicio_1 {
	/*
	 * Exercício 1: Crie um método recursivo que receba um valor inteiro decimal e
	 * retorne uma String com o valor correspondente em binário.
	 */

	public static void main(String[] args) {
		int decimal = 578;
		conversor(decimal);
	}

	public static void conversor(int decimal) {
		if (decimal <= 2) {
			System.out.println(decimal / 2);
			System.out.println(decimal % 2);
		} else {
			conversor(decimal / 2);
			System.out.println(decimal % 2);
		}

	}
}
