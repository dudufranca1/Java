package exercicios;

import java.util.Scanner;

public class NumPar0ou10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		int numero = sc.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
			System.out.println("O n�mero " +numero+ " est� entre 0 e 10 e � um par.");
			}
			else {
				System.out.println("O n�mero " +numero+ " est� entre 0 e 10 mas n�o � par.");
			}
		}
		else {
			System.out.println("O n�mero " +numero+ " n�o est� entre 0 e 10 e n�o � par.");
		}
		
		

		

		sc.close();
	}
}
