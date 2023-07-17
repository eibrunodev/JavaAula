package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite um numero");
		String valor2 = JOptionPane.showInputDialog("Digite outro numero");
		String operador = JOptionPane.showInputDialog("Digite qual a operação");
				
		double soma = "+".equals(operador.trim())? Double.parseDouble(valor1)+Double.parseDouble(valor2) : 0;
		double subtracao = "-".equals(operador.trim()) ? Double.parseDouble(valor1)-Double.parseDouble(valor2) : 0;
		double divisao = "/".equals(operador.trim()) ? Double.parseDouble(valor1)/Double.parseDouble(valor2) : 0;
		double multiplicacao = "*".equals(operador.trim()) ? Double.parseDouble(valor1)*Double.parseDouble(valor2) : 0;
		double resto = "%".equals(operador.trim()) ? (Double.parseDouble(valor1)*Double.parseDouble(valor2))%2 : 0;
		
		
		System.out.println("O resultado da soma é:"+soma); 
		System.out.println("O resultado da subtracao é:"+subtracao); 
		System.out.println("O resultado da divisao é:"+divisao); 
		System.out.println("O resultado da multiplicacao é:"+multiplicacao); 
		System.out.println("O resultado do resto é:"+resto);    
	}
}
