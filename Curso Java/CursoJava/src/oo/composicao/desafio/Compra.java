package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int quantidade) {
		// adicionando a lista j� com os elementos
		this.itens.add(new Item(p, quantidade));
	}
	
	// adicionando e inst�nciando um item e um produto
	// cria o item, cria o produto e autom�ticamente j� adiciona na lista
	void adicionarItem(String nome, double preco, int quantidade) {
		// usando infer�ncia
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		// obtendo valor total de cada item
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
