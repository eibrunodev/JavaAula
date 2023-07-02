package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		double a =1; //conversão implicita 
		System.out.println(a);
		
		float b =  (float) 1.8995845485;//conversão explicita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte)c;//conversão explicita
	}

}
