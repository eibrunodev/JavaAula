package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);//double -> Double
		conjunto.add(true);
		conjunto.add("TEste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho" + conjunto.size());
		System.out.println("Tamanho" + conjunto.size());
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho" + conjunto.size());
		
		System.out.println(conjunto.contains("TEste"));
	}

}
