package Fundamentos;

public class A_41_OperadoresLogicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2); // operador OU EXCLUSIVO, � verdade se
												   // os dois forem V ou F.
		System.out.println(!!condicao1); // mant�m o mesmo valor l�gico.
		System.out.println(!condicao2); // alterar o valor ex: false to true.
	}
}
