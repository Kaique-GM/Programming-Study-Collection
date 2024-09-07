package Pilhas_Arrays;

import java.util.ArrayList;
import java.util.List;

public class PilhaArray {
	/*
	 * Exercício 2:
	 * Com base na classe PilhaArray, crie uma Classe Pilha que
	 * implemente todos os métodos padrões, mas utilizando Listas ao invés de
	 * vetores para armazenar os dados. Teste o objeto pilha empilhando uma lista
	 * sequencial de números e os desempilhando em seguida.
	 */
	public List<Object> elementos;
	
	
	public PilhaArray() {
		elementos = new ArrayList<>();
	}

	public void empilhar(Object item) {
		elementos.add(item);
	}

	public Object desempilhar() {
		if(!pilhaVazia()) {
      return elementos.remove(elementos.size() - 1);
		}
		return null;
	}

	public boolean pilhaVazia() {
		if (elementos.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}


	}

