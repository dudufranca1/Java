package exercicios;
import java.util.Scanner;
public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contadorDeDivisores = 0;

		System.out.println("Digite um numero para verificar se � primo:");
		int numero = sc.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " � primo.");
		} else {
			System.out.println("\nO numero " + numero + " n�o � primo.");
		}

		sc.close();
	}
}
