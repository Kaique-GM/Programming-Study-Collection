package Recursao;

public class Exercicio_2 {
	/*
	 * Exercício 1: Crie um método recursivo que receba dois números inteiros como
	 * parâmetros, o primeiro será o número base e o segundo a potência, e retorne o
	 * valor da função.
	 * 
	 */
	public static void main(String[] args) {
		int base = 10;
		int potencia = 2;
		System.out.println(total(base, potencia));
	}

	public static int total(int base, int potencia) {
		if (potencia == 0) {
			return 1;
		} else {
			return base * total(base, potencia - 1);
		}
	}

}
