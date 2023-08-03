package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		lista.add(new Usuario("Bruno"));
		lista.add(new Usuario("Carla"));
		lista.add(new Usuario("Davi"));
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Mateus"));
		
		for (Usuario usuario : lista) {
			System.out.println(usuario);
		}
		
		//por index >>
		System.out.println(lista.get(3).nome);
		
		
	}
}
