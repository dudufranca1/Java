package testes;
import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fat = sc.nextInt();	
		int valor = sc.nextInt();
			

		for( int i = 2; i <= valor; i++ )
		{
		fat *= i;
		}

		System.out.println( "O fatorial de " + valor + " é igual a " + fat );
		
	}
}
