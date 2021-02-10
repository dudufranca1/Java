package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Jo�o Pedro";
		// Tendo controle adicionando o item na lista de itens e criando o item
		// usando m�todo que eu criei em Compras "adicionarItem"
		// tamb�m criei um m�todo para n�o precisar criar um novo item com "new Item"
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem(new Item("Borracha", 12, 3.89));
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		// S� para mostrar a rela��o bidirecional
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O valor total � R$" + total);
	}
}
