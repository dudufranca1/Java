package Fundamentos;

public class A_43_OperadoresRelacionais {
	public static void main(String[] args) {
		
		int a = 90;
		int b = 10;
		
		System.out.println(a == b); // operador de igualdade.
		System.out.println(a > b); // operador de copara��o maior.
		System.out.println(a >= b); // operador de copara��o maior igual.
		System.out.println(a < b); // operador de copara��o menor qu�.
		System.out.println(a <= b); // operador de copara��o menor igual.
		System.out.println(a != b); // operador de copara��o diferente.
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " +temDesconto);
	}
}
