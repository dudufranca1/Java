package Fundamentos;

import java.util.Scanner;

public class A_47_IgualdadeStrings {
	// equals = fun��o de compara��o de strings,
	// compara o conte�do de strings.
	// trim = fun��o parar tirar os espa�os em branco de strings.
	// next = tamb�m tira os espa�os // next.Line = n�o tira
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = "2";
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner sc = new Scanner(System.in);
		String s2 = sc.nextLine();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		
		sc.close();
	}

}
