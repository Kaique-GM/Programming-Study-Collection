package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o caminho para o Arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Funcionario> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.print("Digite o Salário: ");
			double s = sc.nextDouble();
			System.out.println("Email das pessoal que tem o salario maior que " + String.format("%.2f", s) + "$:");
			List<String> emails = list.stream()
					.filter(f -> f.getSalario() > s).map(f -> f.getEmail())
					.sorted((f1, f2) -> f1.toUpperCase().compareTo(f2.toUpperCase()))
					.collect(Collectors.toList());
			emails.forEach(System.out::println);

			double sum = list.stream()
					.filter(f -> f.getNome().charAt(0) == 'M')
					.map(f -> f.getSalario()).reduce(0.0,(x, y) -> x + y);

			System.out.println("Soma dos sálarios das pessoas cujo nome começa com M: " + String.format("%.2f", sum));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}
		sc.close();
	}
}
