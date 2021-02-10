package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila /* Queue */{
	public static void main(String[] args) {
		// FIFO -> frist in first out
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		
		// Diferen�a � o comportamento ocorre
		// quando a fila est� cheia
		fila.add("Ana"); // add -> retorna false
		fila.offer("Beatriz"); // offer -> lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obtem o pr�ximo elemento
		// da fila (sem remover)
		
		// Diferen�a � o comportamento ocorre
		// quando a fila est� vazia
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lan�a uma exce��o
		System.out.println(fila.element());
		
		// Poll e Remove -> obtem o pr�ximo elemento 
		// da fila e remove		
		// Diferen�a � o comportamento ocorre
		// quando a fila est� vazia
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); // retorna uma exce��o
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty;
		// fila.contains(...);
	}
}
