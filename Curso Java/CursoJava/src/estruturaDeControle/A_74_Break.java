package estruturaDeControle;

public class A_74_Break {
	public static void main(String[] args) {
		
		// Break = quebra o fluxo da execu��o no momento que � encontrado o valor.
		// Break = faz mais sentido em um la�o de repeti��o.		
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}
}
