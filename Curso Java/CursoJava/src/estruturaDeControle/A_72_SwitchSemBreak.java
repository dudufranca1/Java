package estruturaDeControle;

import java.util.Scanner;

public class A_72_SwitchSemBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String faixa = "preta";
		
		// quando o break não utilizado a execução
		// do código é feita completa e todas as saídas
		// serão imprimidas
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sou faixa preta.");
		case "marom":
			System.out.println("Sou faixa marom.");
		case "roxa":
			System.out.println("Sou faixa roxa.");
		case "azul":
			System.out.println("Sou faixa azul.");
		case "branca":
			System.out.println("Sou faixa branca.");
			break;
		default:
			System.out.println("Não luto jiu.");
		}
		
		int idade = 3;
		
		switch(idade) {
		case 4:
			System.out.println("Sabe brincar.");
		case 3:
			System.out.println("Sabe andar.");
		case 2:
			System.out.println("Sabe falar.");
		case 1:
			System.out.println("Sabe comer.");
		}
		
		

		sc.close();
	}
}
