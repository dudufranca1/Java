package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	// Supplier
	// n�o recebe nenhum par�metro de entrega e retorna um valor
	public static void main(String[] args) {
		
		Supplier<List<String>> umLista =
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
				
		System.out.println(umLista.get());
	}
}
