package estruturaDeControle;

import java.util.Scanner;

public class A_68_For2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont;

		for(cont = 10; cont >= 0; cont -= 2) {
			System.out.printf("Contador = %d\n",cont);
		}

		sc.close();
	}
}
