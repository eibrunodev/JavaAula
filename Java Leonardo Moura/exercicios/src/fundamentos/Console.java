package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = scan.nextLine();
		
		System.out.printf("Seu nome é: %s", nome);
		
		scan.close();//para economizar memoria devemos fechar o Scanner.
	}

}
