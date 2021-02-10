package estruturaDeControle;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class A_60_DesafioDiaSemana {
	public static void main(String[] args) {		
		Scanner sc = new Scanner (System.in);
		
		//String dia = JOptionPane.showInputDialog(
		//"Qual dia da semana? ");
		
		System.out.println("Qual dia da semana?");
		String dia = sc.next();				
		
		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		}
		else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("2");
		}
		else if (dia.equalsIgnoreCase("Terça") 
				|| dia.equalsIgnoreCase("Terca")) {
			System.out.println("3");
		}
		else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
		}
		else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
		}
		else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("6");
		}
		else if (dia.equalsIgnoreCase("Sábado") 
				|| dia.equalsIgnoreCase("Sabado")) {
			System.out.println("7");
		}
		else {
			System.out.println("Dia inválido.");
		}		
		
		sc.close();
	}
}
