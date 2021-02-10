package exercicios;
import java.util.Scanner;
public class SomaNumerosPositivos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 0, total = 0;
		
		while (numero >= 0) {
			System.out.println("Digite um numero inteiro (zero ou negativo para sair): ");
			numero = sc.nextInt();
			
			if (numero >= 0) {
				total += numero; // Isso é igual a somadorDeNumeros = somadorDeNumeros + numero;
				System.out.printf("\nSoma até o momento: %d\n", total);
			}
		}

		sc.close();
	}
}
