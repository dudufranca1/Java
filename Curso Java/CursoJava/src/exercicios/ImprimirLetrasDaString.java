package exercicios;
import java.util.Scanner;
public class ImprimirLetrasDaString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a palavra: ");
		String palavra = sc.nextLine();

		char letras[] = palavra.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}

		sc.close();
	}
}
