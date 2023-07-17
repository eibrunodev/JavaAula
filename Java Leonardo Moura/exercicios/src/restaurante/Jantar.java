package restaurante;

import java.util.Scanner;

public class Jantar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		Comida comida1 = new Comida("Arroz", 0.300);
		Comida comida2 = new Comida("Macarrão", 0.700);
		Comida comida3 = new Comida("Feijão", 0.400);
		Comida comida4 = new Comida("Lasanha", 0.800);

		System.out.println("Digite o seu nome");
		pessoa.nome = entrada.next();

		System.out.println("Digite o seu peso atual");
		pessoa.peso = entrada.nextDouble();

		System.out.println(pessoa.nome);

		boolean pararDeComer = false;
		while (pararDeComer != true) {
			int escolha;
			System.out.println("Escolha sua comida:");
			System.out.format("(1)%s (2)%s (3)%s (4)%s :", comida1.nomeComida, comida2.nomeComida, comida3.nomeComida,
					comida4.nomeComida);
			escolha = entrada.nextInt();

			if (escolha == 1) {
				pessoa.Comer(comida1.pesoComida, pessoa.peso);
			}
			
			System.out.println("Pedir algo mais?");
			entrada.next();

		}
		System.out.printf("Peso inícial: %s; Peso Final: %s", pessoa.peso, pessoa.pesoFinal);
		entrada.close();
	}
}
