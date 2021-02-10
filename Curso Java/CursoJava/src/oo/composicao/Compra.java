package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	
	ArrayList<Item> itens = new ArrayList<Item>();
	
	// método para receber os atributos
	// instânciando os objetos dentro do método
	// método recebendo os parâmetros
	void adicionarItem(String nome, int quantidade, double preco) {
		// chamando o método de baixo para adicionar o item e setar a compra para ter
		// relação bidirecional de forma consistente
		this.adicionarItem(new Item(nome, quantidade, preco));
	}

	// criando método para adicionar item dentro da lista de itens (controlando)
	void adicionarItem(Item item) {
		// adicionando a compra associado ao item (bidirecional)
		this.itens.add(item);
		// pegando o objeto atual this e adicionando referência de compra dentro de item
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;

		for(Item item : itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
	
	
}
