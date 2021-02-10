package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	
	ArrayList<Item> itens = new ArrayList<Item>();
	
	// m�todo para receber os atributos
	// inst�nciando os objetos dentro do m�todo
	// m�todo recebendo os par�metros
	void adicionarItem(String nome, int quantidade, double preco) {
		// chamando o m�todo de baixo para adicionar o item e setar a compra para ter
		// rela��o bidirecional de forma consistente
		this.adicionarItem(new Item(nome, quantidade, preco));
	}

	// criando m�todo para adicionar item dentro da lista de itens (controlando)
	void adicionarItem(Item item) {
		// adicionando a compra associado ao item (bidirecional)
		this.itens.add(item);
		// pegando o objeto atual this e adicionando refer�ncia de compra dentro de item
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
