package exercicios;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o ano: ");
		int ano = sc.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("O ano " +ano+ " � um ano bissexto.");			
		}
		else {
			System.out.println("O ano " +ano+ " n�o � um ano bissexto.");	
		}

		sc.close();
	}
}
