package estruturaDeControle;

import java.util.Scanner;

public class A_55_IF {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = sc.nextDouble();
		
		if(media <= 10 && media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recupera��o.");
		}
		
		boolean criteiroReprovacao = media < 4.5 && media > 0;
		if(criteiroReprovacao) {
			System.out.println("Reprovado.");
		}
		
		
		sc.close();
	}
}
