package Vetores;

import java.util.Scanner;

public class Exercicio_4 {
	/*
	 * Crie um método que receba como parâmetro um número decimal, converta esse
	 * número para binário e retorne na forma de um vetor com 8 posições. Para obter
	 * o resto de uma divisão utilize o operador %. Exemplo: int resto = 9 % 2
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int decimal = sc.nextInt();
		// converte para binário
		String binario = converterDecimal(decimal);
		// converte para vetor
		char[] vetor = binario.toCharArray();
		for (char c : vetor) {
			System.out.print(c + " ");
		}
		sc.close();
	}
	// Método recursivo
	public static String converterDecimal(int decimal) {
		if (decimal == 0) {
			return "0";
		}
		if (decimal == 1) {
			return "1";
		}
		return converterDecimal(decimal / 2) + (decimal % 2);
	}
}
