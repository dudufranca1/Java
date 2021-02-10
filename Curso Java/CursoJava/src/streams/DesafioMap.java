package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/*
		 * 1. N�mero para string bin�ria
		 * 2. Inverter a string
		 * 3. Converter de volta para inteiro
		 */
		
		UnaryOperator<String> inverter =
				s -> new StringBuilder(s).reverse().toString();
		
		// s = entende-se que � d�cimal
		// 2 = entende-se que est� passando uma String bin�ria
		Function<String, Integer> binarioParaInt =
				s -> Integer.parseInt(s, 2); 
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println);
		
	}
}
