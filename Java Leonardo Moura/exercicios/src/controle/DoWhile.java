package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nota = "";
		double total = 0;
		int qtNotas = 0;
		do {
			System.out.println("Digite uma nota:");
			nota = entrada.next();				
			if(Double.parseDouble(nota) > 10){
				System.out.println("Nota Inválida");
			}else if(!nota.equals("-1")){
				total = total + Double.parseDouble(nota); 
				qtNotas++;
			};
		} while(!nota.equals("-1"));
		
		System.out.printf("Media das notas: %s",total/qtNotas);
		entrada.close();

	}

}
