package Fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (�F - 32) x 5/9 = �C
		
		double f = 86, c;
		final double sub = 32; 
		final double div = 5.0 / 9.0;
		
		c = (f - sub) * div;
		
		System.out.println("O resultado � " +c+ "� graus celsius.");
		
	}
}
