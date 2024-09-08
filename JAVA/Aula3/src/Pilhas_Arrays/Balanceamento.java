package Pilhas_Arrays;

import java.util.ArrayList;
import java.util.List;


public class Balanceamento {
	private String linha;

	public Balanceamento(String linha) {
		this.linha = linha;
	}


	public static boolean validaBalanceamento(String linha) {
		List<Character> simbolos = new ArrayList<>();
		char simbolo1 = '{';
		char simbolo2 = '[';
		char simbolo3 = '(';

		char simbolo4 = '}';
		char simbolo5 = ']';
		char simbolo6 = ')';

		for (int i = 0; i < linha.length(); i++) {
			if (linha.charAt(i) == simbolo1) {
				simbolos.add(simbolo4);
			}
			else if(linha.charAt(i) == simbolo2) {
				simbolos.add(simbolo5);
			}
			else if(linha.charAt(i) == simbolo3) {
				simbolos.add(simbolo6);

			}
			
			else if(linha.charAt(i) == simbolo4 || linha.charAt(i) == simbolo5 || linha.charAt(i) == simbolo6) {
				if (simbolos.isEmpty()) {
			        return false;
			    }
			 if (simbolos.get(simbolos.size() - 1) != linha.charAt(i)) {
                 return false;
             }
			 simbolos.remove(simbolos.size() - 1);
			}
		}
			System.out.print(simbolos);
	return true;
	}
}


