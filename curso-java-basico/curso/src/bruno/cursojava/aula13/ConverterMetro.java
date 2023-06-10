package bruno.cursojava.aula13;

import java.util.Scanner;

public class ConverterMetro {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite quantos metros para converter em Cm: ");
		double metro = Double.valueOf(scan.nextDouble());
		
		double cm = metro * 100;
		
		System.out.println("Convertemos "+metro+"metros em "+cm+" cm");
		
	}

}
