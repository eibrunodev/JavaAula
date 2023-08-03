package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> livro = new ArrayDeque<>();
		
		livro.add("Pai rico Pai pobre");
		livro.add("Segredos da mente milionaria");
		livro.add("Poder da ação");
		livro.add("48 leis do sucesso");
		
		
		System.out.println(livro.peek());
		System.out.println(livro.peek());
		System.out.println(livro.element());
		
		System.out.println(livro.poll());
		System.out.println(livro.poll());
		System.out.println(livro.poll());
	}

}
