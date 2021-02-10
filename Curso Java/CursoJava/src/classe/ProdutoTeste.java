package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		// Construtor de forma explícita
		Produto p1 = new Produto("Notebook", 4356.89);
		
		// Inferência var p2
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		//p2.desconto = 0.29;
		
		// Alterando o desconto de todos os produtos já que desconto pertence a classe
		// desconto é um atributo static
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		//double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal1 = p1.precoComDesconto();
		//double precoFinal2 = p2.preco * (1 - p2.desconto);
		// 0.1 dentro do método para utilizar o descontoGerente
		double precoFinal2 = p2.precoComDesconto(0.1);
		double media = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Carrinho: R$%.2f. ",media);
		
		
		
	}
}
