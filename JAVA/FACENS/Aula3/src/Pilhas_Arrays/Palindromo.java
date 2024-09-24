package Pilhas_Arrays;

import java.util.ArrayList;
import java.util.List;


/* Exercício 3:
 * Crie um método que recebe uma String e retorne True se a String é Palíndromo.
 * Ou seja, o nome é lido da mesma forma nos dois sentidos.
 * Para isso utilize uma pilha para inverter o nome, exemplo: “maria”  “airam”
 * Depois compare o nome invertido com o original, se forem iguais é palíndromo. */

public class Palindromo {

	List<Object> nomes = new ArrayList<>();

	public boolean isPalindromo(String nome) {
		char[] palavraInvertida = InverteString();
		String palavraInvertidaStr = new String(palavraInvertida);
		if (nome.equalsIgnoreCase(palavraInvertidaStr)) {
			return true;
		} else {
			return false;
		}
	}

	public char[] InverteString() {
		char[] palavraInvertida = new char[nomes.size()];

		if (!nomes.isEmpty()) {
			for (int i = 0; i < palavraInvertida.length; i++) {
				palavraInvertida[i] = (char) nomes.get(nomes.size() - 1 - i);
			}
			return palavraInvertida;
		}
		return null;

	}

	public void EmpilhaString(String nome) {
		for (int i = 0; i < nome.length(); i++) {
			nomes.add(nome.charAt(i));
		}
		System.out.println(nomes);
	}
}
