package Vetores;

public class Exercicio_2 {
	/*
	 * Exercício 2: Crie um método que receba 3 vetores com 8 posições cada e
	 * retorne uma matriz de 8x3 posições com os respectivos valores
	 * armazenados nos vetores.
	 */

	public static void main(String[] args) {
		int[] vetor1 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7 };
		int[] vetor2 = new int[] { 8, 9, 10, 11, 12, 13, 14, 15 };
		int[] vetor3 = new int[] { 16, 17, 18, 19, 20, 21, 22, 23 };
		makeMatriz(vetor1, vetor2, vetor3);
	}

	public static int[][] makeMatriz(int vetor1[], int vetor2[], int vetor3[]) {
		int[][] mat = new int[8][3];
		for (int i = 0; i < 8; i++) {
			mat[i][0] = vetor1[i];
			mat[i][1] = vetor2[i];
			mat[i][2] = vetor3[i];
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 3; j++) {
			  System.out.print(mat[i][j] + " ");
			}
		}
		return mat;
	}

}
