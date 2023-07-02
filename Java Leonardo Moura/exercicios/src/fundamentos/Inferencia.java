package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		//Exemplo de Inferência
		int a = 2; //aqui classificamos a variável como int na inferencia não classificamos
		
		var b = 4.5; //aqui ela infere o tipo da variável quando a mesma recebe o valor
		
		var c = "texto";
		System.out.println(a + b + c);
	}

}
