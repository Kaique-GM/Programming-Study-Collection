package Exercicio_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();
		///////////////////////////////////////////////////////////////////
		//Leitura
		System.out.println("Digite o caminho para o arquivo: ");
		String path = sc.nextLine();

		System.out.println("Leitura do Arquivo:");
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);

				String[] itens = line.split(", ");
				String name = itens[0];
				double price = Double.parseDouble(itens[1]);
				int quantity = Integer.parseInt(itens[2]);

				produtos.add(new Produto(name, price, quantity));

				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println();
		////////////////////////////////////////////////////////////////////////
		//Escrita
		System.out.println("//////////////////////////////////////////////////");
		System.out.println();
		System.out.println("Digite o caminho para escrever no arquivo \"Summary.csv\": ");
		String path2 = sc.nextLine();
		System.out.println("Escrevendo no Arquivo...");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
			for (Produto p : produtos) {
				bw.write(p.getName() + ", " + p.sumTotal());
				bw.newLine();
				System.out.println("Escrita realizada com sucesso!!!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		////////////////////////////////////////////////////////////////////////
		//Leitura da escrita
		System.out.println("//////////////////////////////////////////////////");
		System.out.println();
		System.out.println("Leitura do Arquivo:");
		try (BufferedReader br = new BufferedReader(new FileReader(path2))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
