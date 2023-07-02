package fundamentos.operadores;

public class DesafioAritimetico {

	public static void main(String[] args) {
		double a = 6 * (3+2);
		double b = Math.pow(a,2);
		
		double ab = b / (3*2);
		
		double c = ((1-5) * (2-7))/2;
		double d = Math.pow(c,2);
		double cd = d;
		
		double result1 = ab - cd;		
		
		double result2 = (Math.pow(result1, 3))/ (Math.pow(10, 3));
		System.out.println(result2);
	}

}
