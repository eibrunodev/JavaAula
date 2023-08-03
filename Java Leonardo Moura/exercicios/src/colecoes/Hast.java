package colecoes;

import java.util.HashSet;

public class Hast {

	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Bruno"));
		usuarios.add(new Usuario("Maria"));
		usuarios.add(new Usuario("Samuel"));
		usuarios.add(new Usuario("Artur"));
		
		boolean resultado = usuarios.contains(new Usuario("Samuel"));
		System.out.println(resultado);

	}

}
