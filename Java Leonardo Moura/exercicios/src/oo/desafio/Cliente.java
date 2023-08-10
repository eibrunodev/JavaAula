package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nome;
	final List<Compra> compra = new ArrayList<>();
	
	Cliente(String nome){
			this.nome = nome;
	}
	
	void adicionarCompra(Compra compra){
		this.compra.add(compra);
	}
	
	double obterValorTotal(){
		double total = 0;
		for (Compra compra2 : compra) {
			total += compra2.obterTotal();
		}
		return total;
	}
}
