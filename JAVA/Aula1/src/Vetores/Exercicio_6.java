package Vetores;

import java.util.Scanner;

public class Exercicio_6 {
	/*
	 * Escreva um método para imprimir no console uma matriz de 2 dimensões. Utilize
	 * o seguinte padrão. | X | X| X | | Y | Y| Y | | Z | Z| Z | Utilize
	 * System.out.print( “|” + ”\t” + variável + “\t” + “|”) para imprimir no
	 * console os marcadores com o espaço TAB entre eles
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		
		stringMatriz(matriz);
	}

	public static void stringMatriz(int[][] matriz) {
		System.out.println("Preencha a matriz de números inteiros: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Linha: [" + i + "], Coluna: [" + j + "]:");
				matriz[i][j] = sc.nextInt();
			}
		}
		// só funciona se o número de linhas for igual ao número de colunas.
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("|" + "\t" + matriz[i][j] + "\t"+ "|");
			}
			System.out.println();
		}

	}
}
