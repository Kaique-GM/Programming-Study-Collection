package Vetores;

public class Exercicio_1 {
	/*
	 * Exercício 1: Crie um método que receba 1 vetor com 8 posições, inverta a
	 * ordem dos itens e retorne o vetor invertido.
	 */

	public static void main(String[] args) {
		int []vetor = new int[] { 0, 1, 2, 3, 4, 5, 6, 7 };
		inverteVetor(vetor);
	}

	public static int[] inverteVetor(int[] vetor) {
		int []aux = new int [8];
		for(int i = 0; i< 8;i++) {
			aux[i] = vetor[7-i];
			System.out.print(aux[i] + "\n");
		}
	return aux;
		
	}
}
