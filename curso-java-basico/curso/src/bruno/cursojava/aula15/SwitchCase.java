package bruno.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um dia da semana: ");
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 1: {			
			System.out.print("Segunda");
			break;
		}
		case 2:{
			System.out.print("Terça");
			break;
		}
		case 3:{
			System.out.print("Quarta");
			break;
		}
		case 4:{
			System.out.print("Quinta");
			break;
		}
		case 5:{
			System.out.print("Sexta");
			break;
		}
		case 6:{
			System.out.print("Sábado");
			break;
		}
		case 7:{
			System.out.print("Domingo");
			break;
		}
		default:
			System.out.println("Valor inválido: " + diaSemana);			
		}
	}

}
