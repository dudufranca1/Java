package exercicios;
import java.util.Scanner;
public class MediaAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, media;
		
		System.out.println("Informe sua primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Informe sua segunda nota: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("Sua m�dia �: " +media);
			System.out.println("Voc� foi aprovado, parab�ns!");
		}
		else if(media < 7 && media > 4) {
			System.out.println("Sua m�dia �: " +media);
			System.out.println("Voc� est� de recupera��o.");
		}
		else {
			System.out.println("Sua m�dia �: " +media);
			System.out.println("Voc� foi reporvado.");
		}

		sc.close();
	}
}
