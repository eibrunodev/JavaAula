package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
//		Set<String> lista = new HashSet<String>();		
//		lista.add("Bruno");
//		lista.add("Maria");
//		lista.add("Davi");
//		lista.add("Jany");
//		lista.add("Artur");
		
		SortedSet<String> lista = new TreeSet<>();		
		lista.add("Bruno");
		lista.add("Maria");
		lista.add("Davi");
		lista.add("Jany");
		lista.add("Artur");
		
		for (String candidato : lista) {
			System.out.println(candidato);
		}
		
		
		Set<Integer> num = new HashSet<>();
		
		num.add(12);
		num.add(32);
		num.add(4);
		num.add(5);
		num.add(78);
		
		for (Integer numeros : num) {
			System.out.println(numeros);
		}
		
		System.out.println(lista);
		
		
		
	}

}
