package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		// Represents an operation upon two operands of the same type, 
		// producing a result of the same type as the operands.
		BinaryOperator<Double> calc = (x, y) -> {return x + y;};	
		System.out.println(calc.apply(2.0, 3.0));
				
		// de forma implicita sem {}
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> {return x + y;};	
		System.out.println(calc2.apply(2, 3));
				
		// de forma implicita sem {}
		calc = (x, y) -> x * y;
		System.out.println(calc2.apply(2, 3));
		
		
	}
}
