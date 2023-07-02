package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		double far = 86;
		final int CONV = 32; 
		final double media1 = 5.0;
		final double media2 = 9.0;
		double celsius = (far - CONV) * media1/media2;
		
		System.out.println("Sua temperatua em Celsius é:" + celsius); // CTRL + alt + seta down copia para baixo
		
	}

}
