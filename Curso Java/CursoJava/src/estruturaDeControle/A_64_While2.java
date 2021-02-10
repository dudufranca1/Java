package estruturaDeControle;

import java.util.Scanner;

public class A_64_While2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String texto = "";

		while(!texto.equalsIgnoreCase("sair")) {
			System.out.println("Qual sua mensagem? ");
			texto = sc.nextLine();
		}
		
		sc.close();
	}
}
