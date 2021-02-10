package exercicios;
import java.util.Scanner;
public class JogoAdivinhacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 0, numeroSorteado = 66;		
		
		while(numero != numeroSorteado) {
			System.out.println("Qual o número?");
			numero = sc.nextInt();
			if(numero > 0 && numero < 100) {
				if(numero == numeroSorteado) {
				System.out.println("Você acertou!");
				}
				else {
					System.out.println("Você errou, tente novamente.");
				}
			}
			else {
				System.out.println("Número inválido.");
			}
		}
		

		sc.close();
	}
}
