package UI;

import Pilhas_Arrays.PilhaArray;

public class Program_EX2 {
	public static void main(String[] args) {

		PilhaArray p = new PilhaArray();

		System.out.println("A Pilha está vazia?: " + p.pilhaVazia());
		
		System.out.println("Preenchendo Pilha(Com Array):");
		for (int i = 0; i < 10; i++) {
			p.elementos.add(i);
			System.out.print((i));
		}
		
		System.out.println();
		
		System.out.println("Desenpilhando Pilha(Com Array):");
		for (int i = 0; i < 10; i++) {
			System.out.print(p.desempilhar());
		}
	}
}
