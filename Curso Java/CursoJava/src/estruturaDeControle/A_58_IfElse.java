package estruturaDeControle;

import javax.swing.JOptionPane;

public class A_58_IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Informe um número: ");
		int num = Integer.parseInt(valor);
		
		if(num % 2 == 0) {
			System.out.println("O número é par.");
		}
		else {
			System.out.println("O número é ímpar.");
		}
	}
}
