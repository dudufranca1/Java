package Fundamentos;

public class A_29_ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		//impl�cita = quando n�o a necessidade de deixar claro a convers�o de vari�vel.
		//explc�ta = quando se tem que deixar e claro.
		
		double a = 1; //impl�cita
		System.out.println(a);
		
		float b = (float) 1.12345; // expl�cita (CAST)
		System.out.println(b);     // tamb�m pode usar f ou F no final do valor.
		
		double e  = 1.999999;
		int f = (int) e;       //expl�cita (CAST)
		System.out.println(f);
	}
}
