package oo.desafio;

public class Servico {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(new Produto("Caneta", 5.00), 5);
		
		Compra compra2 = new Compra();
		compra1.adicionarItem("Caneca", 25.20, 5);;
		
		Cliente cliente1 = new Cliente("Marcos bento");
		cliente1.adicionarCompra(compra2);
		cliente1.compra.add(compra2);
		
		System.out.println(cliente1.obterValorTotal());
	}

}
