package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	// para silenciar as adivert�ncias
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// Conjunto de dados heterog�neo (v�rios tido de dados).
		HashSet conjunto = new HashSet();		
		// N�o aceita tipos primitivos, ent�o ele converte para objeto
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String -> j� � objeto
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		
		// Size para saber a quantidade de elementos de um conjunto
		System.out.println("Tamanho �: " +conjunto.size());
		// Remove para remover elementos do conjunto
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Tamanho �: " +conjunto.size());
		// Contains para saber se o elemento est� contido no conjunto
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		
		// addAll = fazer uni�o entre os conjuntos 
		// peguei tudo que tinha dentro de nums e joguei conjunto
		// conjunto.addAll(nums); // Uni�o entre dois conjuntos
		// retainAll = fazer interse��o entre os conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear(); // para limpar o conjuntos
		System.out.println(conjunto);
		
	}
}
