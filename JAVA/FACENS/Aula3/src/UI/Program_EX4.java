package UI;

import java.util.Arrays;

import Pilhas_Arrays.OrdenaPilhas;

public class Program_EX4 {
		public static void main(String[] args) {
			int[] numeros = new int[] {5, 20, 1, 0, 4, 15};
			OrdenaPilhas p = new OrdenaPilhas(numeros);

			
			System.out.println(Arrays.toString(p.ordenaPilhas()));
			
			
		}
		
	}

