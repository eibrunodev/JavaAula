package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		/*
		 * temos 8 tipos primitivos em Java sendo eles 
		 * byte(1), short(2), int(4), long(8) 
		 * Temos os tipos flutuantes
		 * double(8) e float(4) 
		 * temos por último os tipos
		 * char(caractere > '') boolean(false e true)*/
		
		 byte anosDeEmpresa = 23;
		 short qtVoos = 527;
		 int id = 154222;
		 long pontosEmpresaFunc = 3_135_256_587L;
		 
		 //Tipos numéricos reais		 
		 float salario = 3852.69F;
		 double vendasAcumuladas = 2_125_265_478;
		 
		 //Tipos booleanos		 
		 boolean verdade = true;
		 
		 //Tipo caracter		 
		 char letra = 'a';
		 
		 System.out.println(anosDeEmpresa);
		 System.out.println(qtVoos);
		 System.out.println(id);
		 System.out.println(pontosEmpresaFunc);
		 System.out.println(salario);
		 System.out.println(vendasAcumuladas);
		 System.out.println(verdade);
		 System.out.println(letra);
	}
}
