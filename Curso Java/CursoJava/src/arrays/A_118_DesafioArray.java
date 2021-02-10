package arrays;
import java.util.Scanner;

public class A_118_DesafioArray {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de notas: ");
		int qntdNotas = sc.nextInt();
		
		double notas [] = new double[qntdNotas]; 
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota: " + (i + 1) + ": ");
			notas[i] = sc.nextDouble();
		}
		
		// Foreach para pecorrer todos os elementos sem necessáriamente
		// precisar de uma váriavel para controlar esse for
		double total = 0;
		for(double nota: notas) {
			total +=nota;
		}
		double media = total / notas.length;
		System.out.printf("A média é: %.2f",media);

		sc.close();
	}
}
