package Fundamentos;

public class A_30_ConversaoNumeroString {
	public static void main(String[] args) {
		
		// Funcionalidade
		// .toString(); = converte valores n�mericos para string.
		// .length();   = da o valor do tamanho da string.
		
		Integer num1 = 10000;
		System.out.println(num1.toString());
		
		int num2 = 100000;
		//Integer.toString = pegando tipo primitivo e transformando em string com Wrapper.
		System.out.println(Integer.toString(num2));
		
		//Tamb�m podemos usar concatena��o
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}
}
