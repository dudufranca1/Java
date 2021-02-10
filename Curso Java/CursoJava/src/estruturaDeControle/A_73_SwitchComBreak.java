package estruturaDeControle;

import java.util.Scanner;

public class A_73_SwitchComBreak {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);		
		
		String conceito = "";
		System.out.println("Informe a nota: ");
		int nota = sc.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default:
			System.out.println("Sem inválido.");
		}
		
		System.out.println("Seu conceito é: " +conceito);
		
		sc.close();
	}
}
