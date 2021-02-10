package estruturaDeControle;

public class A_75_Continue {
	public static void main(String[] args) {
		
		// Cotinue = interrompe e repetição que é atribuição a expressão e continua o código.
		// desvia o fluxo de execução.
		
		for (int i = 0; i < 10; i++) {
			// Continue = nesse trecho ele interrompe os números ímpares.
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		for (int i = 1; i <= 10; i++) {
			// Continue = nesse trecho ele interrompe imprimir o número 5.
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
