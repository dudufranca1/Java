package estruturaDeControle;

import java.util.Scanner;

public class A_66_DesafioWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nota = 0, media, total = 0;
		int notasValidas = 0;	
		
		while(nota != -1){
			System.out.println("Informe a nota: ");
			nota = sc.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
			total += nota;
			notasValidas++;
			}
			else if(nota != -1) {
				System.out.println("Nota inválida.");
			}
		}
		
		media = total / notasValidas;
		
		System.out.println(total);
		System.out.println(notasValidas);
		System.out.printf("Média das notas: %.2f",media);
		
		sc.close();
	}
	
}
