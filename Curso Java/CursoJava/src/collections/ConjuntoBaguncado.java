package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	// para silenciar as adivertências
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// Conjunto de dados heterogêneo (vários tido de dados).
		HashSet conjunto = new HashSet();		
		// Não aceita tipos primitivos, então ele converte para objeto
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String -> já é objeto
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		
		// Size para saber a quantidade de elementos de um conjunto
		System.out.println("Tamanho é: " +conjunto.size());
		// Remove para remover elementos do conjunto
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Tamanho é: " +conjunto.size());
		// Contains para saber se o elemento está contido no conjunto
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		
		// addAll = fazer união entre os conjuntos 
		// peguei tudo que tinha dentro de nums e joguei conjunto
		// conjunto.addAll(nums); // União entre dois conjuntos
		// retainAll = fazer interseção entre os conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear(); // para limpar o conjuntos
		System.out.println(conjunto);
		
	}
}
