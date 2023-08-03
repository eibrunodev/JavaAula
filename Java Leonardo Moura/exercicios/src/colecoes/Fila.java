package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// .add() lançará uma exceção caso a fila esteja cheia.
		// .offer() retorna falso caso a fila esteja cheia.
		
		fila.add("Bruno");
		fila.offer("Ana");
		fila.add("Julio");
		fila.offer("Marcos");
		fila.add("Patricia");
		
		System.out.println(fila.peek());//retorna null caso vazia
		System.out.println(fila.peek());
		System.out.println(fila.element());//retorna um erro!! Lança exceção
		System.out.println(fila.element());
		
		
		System.err.println(fila.poll());//retorna o elemento removendo o mesmo
		System.err.println(fila.poll());
		System.err.println(fila.poll());
		
	}

}
