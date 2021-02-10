package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	//Unary Operator
	//Aula 179
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);		
		System.out.println(resultado);
		
		// Compose faz o comportamento(leitura) ao contr�rio
		// antes de ler esse, leia esse
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		System.out.println(resultado2);
	}
}
