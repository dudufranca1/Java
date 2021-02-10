package Fundamentos;

import java.util.Scanner;

public class A_32_DesafioConversao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String salario1;
		String salario2;
		String salario3;
		
		// .replace(oldChar, newChar)
		// podemos usar a virgúla além do ponto, já que um valor flutuante em java usa
		// o padrão de ponto como separador de casas décimais.
		
		System.out.println("Informe o primeiro salário: ");
		salario1 = sc.nextLine().replace(",", ".");
		System.out.println("Informe o segundo salário: ");
		salario2 = sc.nextLine().replace(",", ".");
		System.out.println("Informe o terceiro salário: ");
		salario3 = sc.nextLine().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double mediaSalario = (valor1 + valor2 + valor3) / 3;
		
		System.out.println("A média do salário é: " +mediaSalario);
		
		sc.close();
		
		
	}

}
