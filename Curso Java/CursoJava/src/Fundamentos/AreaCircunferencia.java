package Fundamentos;
import java.util.*;

public class AreaCircunferencia {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		double area, raio;
		//uma constate � uma v�rivel que n�o muda.
		final double PI = 3.14;
		
		System.out.println("Informe o valor do raio: ");
		raio = sc.nextDouble();
		
		area = raio * raio * PI;
		
		System.out.println("�rea = " +area);
		
		sc.close();
	}
}
