package bruno.cursojava.aula13;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digita a 1° Nota: ");
		int nota1 = Integer.valueOf(scan.nextInt());
		
		System.out.print("Digite a 2º Nota: ");
		int nota2 = Integer.valueOf(scan.nextInt());
		
		System.out.print("Digite a 3º Nota: ");
		int nota3 = Integer.valueOf(scan.nextInt());
		
		System.out.print("Digite a 4º Nota: ");
		int nota4 = Integer.valueOf(scan.nextInt());
		
		double media = (nota1 + nota2 + nota3 + nota4)/ 4;
		
		System.out.println("Sua media é igual a: "+media);
	}
}
