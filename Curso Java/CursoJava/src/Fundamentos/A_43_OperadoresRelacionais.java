package Fundamentos;

public class A_43_OperadoresRelacionais {
	public static void main(String[] args) {
		
		int a = 90;
		int b = 10;
		
		System.out.println(a == b); // operador de igualdade.
		System.out.println(a > b); // operador de coparação maior.
		System.out.println(a >= b); // operador de coparação maior igual.
		System.out.println(a < b); // operador de coparação menor quê.
		System.out.println(a <= b); // operador de coparação menor igual.
		System.out.println(a != b); // operador de coparação diferente.
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " +temDesconto);
	}
}
