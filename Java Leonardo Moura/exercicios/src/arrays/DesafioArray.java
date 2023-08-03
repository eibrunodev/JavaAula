package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtNotas;		
		System.out.println("Digite a Quantidade de notas");
		qtNotas = entrada.nextInt();
		
		double[] notasAluno = new double[qtNotas];
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.print("Digite a " + (i+1) +"º nota: ");			
			notasAluno[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for (double d : notasAluno) {
			total += d;
		}
		
		System.out.println("A media do aluno é: " + total/notasAluno.length);
		
		entrada.close();
	}

}
