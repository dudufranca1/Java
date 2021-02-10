package estruturaDeControle;

public class A_75_Continue {
	public static void main(String[] args) {
		
		// Cotinue = interrompe e repeti��o que � atribui��o a express�o e continua o c�digo.
		// desvia o fluxo de execu��o.
		
		for (int i = 0; i < 10; i++) {
			// Continue = nesse trecho ele interrompe os n�meros �mpares.
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		for (int i = 1; i <= 10; i++) {
			// Continue = nesse trecho ele interrompe imprimir o n�mero 5.
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
