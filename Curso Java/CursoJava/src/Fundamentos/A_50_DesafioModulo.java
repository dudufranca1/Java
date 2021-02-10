package Fundamentos;

import java.util.Scanner;

public class A_50_DesafioModulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double num1, num2, resultado;
		String op;
		
		System.out.println("Informe o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.println("Informe o segundo número: ");
		num2 = sc.nextDouble();
		
		System.out.println("Informe a operação: ");
		op = sc.next();
		
		resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f" ,num1, op, num2, resultado);
		
		sc.close();
	}
}
