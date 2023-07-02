package fundamentos;

import java.util.Scanner;
public class DesafioConversao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu salário no Primeiro mês");
		String salario1 = scan.nextLine();
		
		System.out.println("Digite seu salário no Segundo mês");
		String salario2 = scan.nextLine();
		
		System.out.println("Digite seu salário no Terceiro mês");
		String salario3 = scan.nextLine();
		
		double sl1 = Double.parseDouble(salario1.replace(",", ".")); 
		double sl2 = Double.parseDouble(salario2.replace(",", ".")); 
		double sl3 = Double.parseDouble(salario3.replace(",", ".")); 
		
		double media = sl1 + sl2 + sl3 / 3;
		
		System.out.printf("A média dos ultimos 3 salarios é: R$%.2f", media);
		
		scan.close();
	}

}
