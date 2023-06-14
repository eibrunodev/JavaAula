package bruno.cursojava.aula18;

public class Vetores {

	public static void main(String[] args) {
		
		double temp = 31.3;
		double temp2 = 32;
		double temp3 = 33.7;
		double temp4 = 33.7;
		
		double[] temperatura = new double[365];
		
		temperatura[0] = 31.3;
		temperatura[2] = 33;
		temperatura[3] = 32;
		temperatura[4] = 35.7;
		temperatura[5] = 36.3;
		
		for(int i=0; i< temperatura.length;i++) {
			temperatura[i] = temperatura[i]+32.3;
		}
		
		for(int i=0; i< temperatura.length;i++) {
			System.out.println("Temperatura do dia "+i+" é igual a "+temperatura[i]);
		}
	}

}
