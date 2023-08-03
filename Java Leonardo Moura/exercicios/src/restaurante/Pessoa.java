package restaurante;

public class Pessoa {
	String nome = "";
	double peso;
	double pesoInicial = peso;
	double pesoFinal;
	
	double Comer(double pesoComida) {
		return this.pesoFinal = this.pesoFinal + pesoComida;
	}
	
	String pesoEstatistica() {
		return String.format("Peso inícial de %s: %s; Peso Final: %s", this.nome, this.peso, (this.pesoFinal+this.peso));
	}
}
