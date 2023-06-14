package bruno.cursojava.aula19;

public class ExercicioVetor {

	public static void main(String[] args) {
		
		int[] A = new int[5];
		int[] B = new int[5];
		
		for(int i = 0; i< A.length; i++) {
			A[i] = i+1; 
		}
		for(int i =0; i< B.length; i++) {
			B[i] = A[i]*2;
		}
		
		for(int j=0; j<A.length;j++) {
			System.out.println("Vetor A: "+A[j]+" ; Vetor B: "+B[j]);
		}
	}

}
