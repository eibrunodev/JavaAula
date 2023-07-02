package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		if(trabalho1 && trabalho2) {
			System.out.println("Comprar TV de 50 e tomar sorvete" );
		}else if(trabalho1 == false && trabalho2 == true) {
			System.out.println("Comprar TV de 32 e tomar sorvete" );
		}else if(trabalho1 == true && trabalho2 == false) {
			System.out.println("Comprar TV de 32 e tomar sorvete" );
		}else if(trabalho1 == false && trabalho2 == false){
			System.out.println("Ficar em casa é mais saudável :)" );
		};
	}

}
