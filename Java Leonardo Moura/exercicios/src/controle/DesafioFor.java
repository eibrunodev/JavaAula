package controle;

public class DesafioFor {

	public static void main(String[] args) {
		String valor = "#";
		for(String a = "c"; a.length() < "AAAAAA".length(); a = a + "c"){
			System.out.println(valor);
			valor += "#";
		};
		
		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}

}
