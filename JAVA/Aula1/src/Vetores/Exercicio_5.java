package Vetores;

public class Exercicio_5 {
	/*
	 *Escreva um método que receba dois vetores de 5 números cada, gere um terceiro vetor
	 *com os elementos dos outros dois vetores intercalados.
	 *Exemplo: vetor 1º ={A,B,C,D,E} | 2º={1,2,3,4,5} | 3º={A,1,B,2,C,3,D,4,E,5}
	 */

	public static void main(String[] args) {
		int[] vetor1 = new int[] {1, 2, 3, 4, 5};
		int[] vetor2 = new int[] { 100, 200, 300 , 400, 500};
		makeMatriz(vetor1,vetor2);
	}
	
	public static int[]makeMatriz(int vetor1[], int vetor2[]) {
		int[] mat = new int[10];
		for (int i = 0; i < 5; i++) {
			mat[2 * i] = vetor1[i];
            mat[2 * i + 1] = (vetor2[i]);

		}
		for(int i = 0; i < 10; i++) {
			System.out.print(mat[i] + " ");
		}
		return mat;
	}
}


