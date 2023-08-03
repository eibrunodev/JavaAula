package classe;

import java.util.Date;

public class EqualsHastcode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Bruno Souza";
		u1.email = "eibrunodev@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Bruno Souza";
		u2.email = "eibrunodev@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(new Date()));
		
		
	}
}
