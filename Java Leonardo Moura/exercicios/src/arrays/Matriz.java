package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantidade de alunos:");
		int alunosQt = entrada.nextInt();

		System.out.println("Quantidade de Notas por Aluno:");
		int notas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[alunosQt][notas];
		
		double total  = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d:", n + 1 , a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		double media = total / (alunosQt * notas);
		System.out.println("Media da turma: "+media);
		entrada.close();

	}

}
