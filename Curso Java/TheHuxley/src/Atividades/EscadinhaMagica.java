package Atividades;

import java.util.Scanner;

public class EscadinhaMagica {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
//		String valor = "#";
//		
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(valor);
//			valor += "#";
		
		int num , i;
		
		num = sc.nextInt();
				
		for (i = 1; i <= 10; i++) {		
	
			System.out.println(num);
			num++;
			}
			
		sc.close();
	}
}
