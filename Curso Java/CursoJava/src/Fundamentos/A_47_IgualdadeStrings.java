package Fundamentos;

import java.util.Scanner;

public class A_47_IgualdadeStrings {
	// equals = função de comparação de strings,
	// compara o conteúdo de strings.
	// trim = função parar tirar os espaços em branco de strings.
	// next = também tira os espaços // next.Line = não tira
	
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
