package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila /* Queue */{
	public static void main(String[] args) {
		// FIFO -> frist in first out
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		
		// Diferença é o comportamento ocorre
		// quando a fila está cheia
		fila.add("Ana"); // add -> retorna false
		fila.offer("Beatriz"); // offer -> lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obtem o próximo elemento
		// da fila (sem remover)
		
		// Diferença é o comportamento ocorre
		// quando a fila está vazia
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção
		System.out.println(fila.element());
		
		// Poll e Remove -> obtem o próximo elemento 
		// da fila e remove		
		// Diferença é o comportamento ocorre
		// quando a fila está vazia
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); // retorna uma exceção
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty;
		// fila.contains(...);
	}
}
