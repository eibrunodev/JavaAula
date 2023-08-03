package oo.composicao;

import java.util.ArrayList;

public class Compra {
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item){
		this.itens.add(item);
		
	}
	
	double obterValorTotal(){
		double total = 0;
		for (Item item2 : itens) {
			total += item2.qtItem * item2.preco;
		}
		return total;
	}
}
