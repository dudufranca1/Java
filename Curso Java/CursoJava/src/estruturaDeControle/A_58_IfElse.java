package estruturaDeControle;

import javax.swing.JOptionPane;

public class A_58_IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Informe um n�mero: ");
		int num = Integer.parseInt(valor);
		
		if(num % 2 == 0) {
			System.out.println("O n�mero � par.");
		}
		else {
			System.out.println("O n�mero � �mpar.");
		}
	}
}
