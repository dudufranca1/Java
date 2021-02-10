package lambdas;

import java.util.function.Predicate;

public class Predicado {
	// Aula 174 Predicate
	// Predicate é uma interface funcional do java
	// Represents a predicate (boolean-valued function) of one argument.
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> prod.preco * (1 - prod.desconto) >= 750;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
		
	}
}
