package Application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();
		Set<Integer> C = new HashSet<>();

		System.out.println("Quantos estudantes a classe A vai ter?");
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			System.out.println("Digite o Código do " + (i + 1) + "º" + " Aluno");
			int x = sc.nextInt();
			A.add(x);
		}
		System.out.println("Quantos estudantes a classe B vai ter?");
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {
			System.out.println("Digite o Código do " + (i + 1) + "º" + " Aluno");
			int x = sc.nextInt();
			B.add(x);
		}
		System.out.println("Quantos estudantes a classe C vai ter?");
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			System.out.println("Digite o Código do " + (i + 1) + "º" + " Aluno");
			int x = sc.nextInt();
			C.add(x);
		}
		
		Set<Integer> total = A;
		total.addAll(B);
		total.addAll(C);
		System.out.println("Total de Alunos: " + total.size());
		
		
	}
}
