package exercicios;

import java.util.Scanner;

public class MaiorValor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.println("\nDigite um numero: ");
			int valor = sc.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 10);

		System.out.printf("O maior valor foi: " + maiorValor);


		sc.close();
	}
}
