package estruturaDeControle;

public class A_76_BreakRotulado {
	public static void main(String[] args) {
		
		// Modo n�o muito aconselhado a se fazer.
		
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1) {
					break externo;
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
	}
}
