package bruno.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosteclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		
		System.out.println("O nome que você digitou foi: " + nomeCompleto);
		
		System.out.println("Digite sua idade");
		int idade = scan.nextInt();
		
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua Altura:");
		double altura = scan.nextDouble();
		
		System.out.println(altura);
	}

}
