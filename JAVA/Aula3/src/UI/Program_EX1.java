package UI;

import Pilhas_Arrays.PilhaVetor;


public class Program_EX1 {
	public static void main(String[] args) {

		PilhaVetor p = new PilhaVetor(10);

		System.out.println("A Pilha está vazia?: " + p.pilhaVazia());
		System.out.println("A Pilha está cheia?: " + p.pilhaCheia());
		////Empilhar
		System.out.println("Preenchendo Pilha(Com Vetor):");
		for (int i = 0; i < 10; i++) {
			p.empilhar(i);
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Desempilhando Pilha(Com Vetor):");
		///Desempilhar
		for (int i = 0; i < 10; i++) {
			System.out.print(p.desempilhar());
		}

	}
}
