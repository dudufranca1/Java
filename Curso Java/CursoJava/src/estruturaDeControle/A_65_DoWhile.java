package estruturaDeControle;

import java.util.Scanner;

public class A_65_DoWhile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisar ir ao médico");
			System.out.println("Vamos? ");
			texto = sc.nextLine();
		}
		
		while(!texto.equalsIgnoreCase("Sim"));
		
		System.out.println("Muito bem!");
		
		sc.close();
		
	}
}