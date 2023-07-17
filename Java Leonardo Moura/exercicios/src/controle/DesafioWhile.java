package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String digitado = "";
		
		while(!digitado.equalsIgnoreCase("sair")) {
			System.out.println("\nDigite alguma coisa!!");
			digitado = entrada.next();
			System.out.printf("Você digitou: %s", digitado);
		};
		System.out.println("\nObrigado!!");
		
		entrada.close();

	}

}
