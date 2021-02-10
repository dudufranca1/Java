package lambdas;
// Aula 167
public class CalculoTeste2 {
	public static void main(String[] args) {
		
		// Express�o lambda
		// Fun��o an�nima
		// Bate extamente com a defini��o do m�todo "executar" que foi definido em Calculo
		// com {} de forma explicita
		Calculo calc = (x, y) -> {return x + y;};	
		System.out.println(calc.executar(2, 3));
				
		// de forma implicita sem {}
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
		
	}
}
