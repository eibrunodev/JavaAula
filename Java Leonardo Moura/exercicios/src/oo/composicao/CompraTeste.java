package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();	
		c1.cliente = "João do feijão";
		c1.adicionarItem(new Item("Caneta", 20, 7.99));
		c1.adicionarItem(new Item("Borracha", 20, 4.99));
		c1.adicionarItem(new Item("Lapis", 10, 8.99));
		
		System.out.println(c1.obterValorTotal());
	}

}
