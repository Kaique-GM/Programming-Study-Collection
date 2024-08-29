package Vetores;

import java.util.Scanner;

public class Exercicio_7 {
	/*
	 * Crie um método que dado uma matriz [3x2] gere sua equivalente [2x3]
	 * transposta. utilize o algoritmo do exercício 6 para imprimir a matriz
	 * original e a transposta.
	 * 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] matriz3x2 = new int[3][2];
		matriz3x2[0][0] = 1;
		matriz3x2[0][1] = 5;
		matriz3x2[1][0] = 7;
		matriz3x2[1][1] = 3;
		matriz3x2[2][0] = 8;
		matriz3x2[2][1] = 2;
		
		/*
		*| 1 | 7|
		*| 2 | 8|
		*| 3 | 9|
		 */
		stringMatriz3x2(matriz3x2); 
		int[][] matrizConvertida =inverteMatriz(matriz3x2);
		System.out.println();
		stringMatriz2x3(matrizConvertida);
		
	}
	public static int[][] inverteMatriz(int[][] matriz) {
		int linhas3x2 = matriz.length;    // Número de linhas da matriz original
        int colunas3x2 = matriz[0].length; // Número de colunas da matriz original
        int[][] matriz2x3 = new int[colunas3x2][linhas3x2];

		for (int i = 0; i <  linhas3x2; i++) {
            for (int j = 0; j < colunas3x2; j++) {
            	matriz2x3[j][i] = matriz[i][j];
              
                }
		}
		return matriz2x3;
	}


	public static void stringMatriz2x3(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("|" + "\t" + matriz[i][j] + "\t" + "|");
            }
            System.out.println();
        }
    }
		
	public static void stringMatriz3x2(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print("|" + "\t" + matriz[i][j] + "\t" + "|");
			}
			System.out.println();
		}
	}
}
