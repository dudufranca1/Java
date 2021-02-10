package Fundamentos;
import java.util.*;

public class AreaCircunferencia {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		double area, raio;
		//uma constate é uma várivel que não muda.
		final double PI = 3.14;
		
		System.out.println("Informe o valor do raio: ");
		raio = sc.nextDouble();
		
		area = raio * raio * PI;
		
		System.out.println("Área = " +area);
		
		sc.close();
	}
}
