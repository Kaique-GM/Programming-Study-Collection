package UI;

import java.util.Scanner;

import Pilhas_Arrays.Balanceamento;

public class Program_EX5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a frase:");
		String linha = sc.nextLine();
		Balanceamento b = new Balanceamento(linha);
		System.out.println(b.validaBalanceamento(linha));

		sc.close();
	}
}
