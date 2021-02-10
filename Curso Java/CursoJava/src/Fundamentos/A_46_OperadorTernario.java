package Fundamentos;

public class A_46_OperadorTernario {
	public static void main(String[] args) {
		
		// Operador ternário = três operandos 
		// ? = separa a expressão dos valores que vão ser atribuidos.
		// : = separa se a expressão for true or false.
		
		double media = 7.6;
		// Atribuição condicional = se uma expressão for true or false.		
		//String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado.";
		String resultadoFinal = media >= 7.0 ? "aprovado" : "reprovado";
		
		System.out.println("O aluno está " +resultadoFinal);
	}
}
