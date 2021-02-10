package classe;

public class AreaCircunferenciaTeste {
	public static void main(String[] args) {
		
		AreaCircunferencia a1 = new AreaCircunferencia (5);
		// a1.pi = 10000;
		AreaCircunferencia a2 = new AreaCircunferencia (6);
		// a2.pi = 10;
		
		// Assim eu posso acessar a váriavel static PI e mudar o valor
		// AreaCircunferencia.PI = 3.1415;	
		// mas agora usando Final static eu não posso mas alterar o valor de PI
		System.out.println(a1.area());
		
		// AreaCircunferencia.PI = 10;
		System.out.println(a2.area());
		
		System.out.println(AreaCircunferencia.PI);
		System.out.println(Math.PI);
		
	}
}
