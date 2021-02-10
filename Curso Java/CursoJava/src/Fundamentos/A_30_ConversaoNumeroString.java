package Fundamentos;

public class A_30_ConversaoNumeroString {
	public static void main(String[] args) {
		
		// Funcionalidade
		// .toString(); = converte valores númericos para string.
		// .length();   = da o valor do tamanho da string.
		
		Integer num1 = 10000;
		System.out.println(num1.toString());
		
		int num2 = 100000;
		//Integer.toString = pegando tipo primitivo e transformando em string com Wrapper.
		System.out.println(Integer.toString(num2));
		
		//Também podemos usar concatenação
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}
}
