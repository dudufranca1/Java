package exercicios;

import java.util.Scanner;

public class NumPar0ou10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = sc.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
			System.out.println("O número " +numero+ " está entre 0 e 10 e é um par.");
			}
			else {
				System.out.println("O número " +numero+ " está entre 0 e 10 mas não é par.");
			}
		}
		else {
			System.out.println("O número " +numero+ " não está entre 0 e 10 e não é par.");
		}
		
		

		

		sc.close();
	}
}
