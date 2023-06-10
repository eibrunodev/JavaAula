package bruno.cursojava.aula13;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o primeiro numero");
		int n1 = scan.nextInt();
		
		System.out.println("Segundo numero");
		int n2 = scan.nextInt();
		
		int resultado = Integer.valueOf(n1) + Integer.valueOf(n2);
		
		System.out.println("A soma é igual a: " + resultado);
		
		
	}
}
