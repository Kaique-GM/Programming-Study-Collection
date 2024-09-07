package Pilhas_Arrays;

/*Exercício 1
 * Crie uma nova Classe in Java com o nome PilhaArray.
 * 
 * Implemente os métodos empilhar, desempilhar, pilha está vazia e pilha está cheia.
 * 
 * Utilize na implementação um vetor de Object que irá receber como parâmetro via
 * construtor o tamanho do vetor.
 *
 * Teste o objeto pilha empilhando uma lista sequencial de números e os desempilhando em
 * seguida.
 *
 * Utilize os métodos do objeto Array() :
 * length(); que retorna o tamanho do vetor
 *
 * Crie uma variável int com nome de topo para controlar o índice do topo da pilha.
 *
 * Verifique se a pilha já está cheia antes de adicionar um novo item, e se está vazia antes de tentar
 * remover.
*/
public class PilhaVetor {
	Object[] elementos;
	int index;

	public PilhaVetor(int tamanho) {
		this.elementos = new Object[tamanho];
		index = 0;
	}

	public void empilhar(Object item) {
		if(!pilhaCheia()) {
			elementos[index] = item;
			index++;
		}
	}

	public Object desempilhar() {
		if(!pilhaVazia()) {
			index--;
			return elementos[index];
		}
		return null;
	}

	public boolean pilhaVazia() {
		if (index == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean pilhaCheia() {
		if (index == elementos.length) {
			return true;
		} else {
			return false;
		}

	}

}
