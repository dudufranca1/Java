package Fundamentos;

public class A_29_ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		//implícita = quando não a necessidade de deixar claro a conversão de variável.
		//explcíta = quando se tem que deixar e claro.
		
		double a = 1; //implícita
		System.out.println(a);
		
		float b = (float) 1.12345; // explícita (CAST)
		System.out.println(b);     // também pode usar f ou F no final do valor.
		
		double e  = 1.999999;
		int f = (int) e;       //explícita (CAST)
		System.out.println(f);
	}
}
