package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(0.25);
		p1.nome = "Notbook";
		p1.preco = 2700.63;
		
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(p1.precoComDesconto());
		
		Produto p2 = new Produto(0);
		Produto.desconto = 0.50;
		p2.nome = "PC";
		p2.preco = 2700.63;
		System.out.println(p2.precoComDesconto());
		
	}

}
