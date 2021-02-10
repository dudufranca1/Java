package collections;

import java.util.ArrayDeque;
import java.util.Deque;
public class Pilha /* Stack */ {
	public static void main(String[] args) {
        // LIFO
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		//LIFO -> last in first out
		// vai imprimir primeiro O Hobbit em seguida o resto
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro :  livros) {
			System.out.println(livro);
		}
		
		// para remover, no mesmo sentido lifo
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		
		// livros.size();
		// livros.clear();
		// livros.contains();
		// livros.isEmpty(); -> para saber se está vazio (retorna valor boolean)
	}
}
