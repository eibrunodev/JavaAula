package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro Número");
		String valor2 = JOptionPane.showInputDialog("Digite o Segundo Número");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1 + numero2;
		double media = soma / 2;
		System.out.println("O valor da soma é:"+ soma);
		System.out.println("O valor da media é:"+ media);
	}

}
