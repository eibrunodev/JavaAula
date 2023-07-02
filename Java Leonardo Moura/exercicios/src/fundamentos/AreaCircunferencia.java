package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		final double pi = 3.14159; //ao colocar finel no inicio da variável ela fica constante (Boas práticas const com letras Maiúsculas). 
	
		double area = pi*raio*raio;
		System.out.println(area);
	}

}
