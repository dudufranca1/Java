package Fundamentos;

import javax.swing.JOptionPane;

public class A_31_ConversaoStringNumero {
	public static void main(String[] args) {
		
		// J0ptionPane: 
		// Serve para mostrar uma tela de input quando executar o programa.
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		
		//vl1 + vl2 = o java não soma, ele concatena os valores.
		System.out.println(valor1 + valor2);
		
		//parse:
		//funcionalidade para converter string em número.
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma é: " +soma);
		System.out.println("A média é: " +soma / 2);
	}
}
