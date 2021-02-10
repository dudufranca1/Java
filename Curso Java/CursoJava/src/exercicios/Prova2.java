package exercicios;

import javax.swing.JOptionPane;

public class Prova2 {
	 public static void main(String args[]) {
		 
		 double media, somaPontos = 0;
		 
		 double [] Pontos = new double [10];
		 
		 for(int i = 0; i < Pontos.length; i++) {
			 Pontos[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe os pontos"));
			 somaPontos += Pontos[i];
			 
		 }
		 
		 System.out.println(somaPontos);
		 media = somaPontos / 10;
		 System.out.println(media);
		 
		 
	 }

}
