package UI;

import java.util.Scanner;

import Pilhas_Arrays.Palindromo;

public class Program_EX3 {
	public static void main(String[] args) {
		Palindromo p = new Palindromo();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Nome para verificar se ele é um Palíndromo:");
		String nome = sc.nextLine();
		p.EmpilhaString(nome);
		
		System.out.print("Nome invertido: ");
		System.out.println(p.InverteString());

		if (p.isPalindromo(nome)) {
			System.out.println(nome + ": É um Palídromo!");
		} else {
			System.out.println(nome + ": Não é um Palidromo!");
		}
		sc.close();
	}
}
