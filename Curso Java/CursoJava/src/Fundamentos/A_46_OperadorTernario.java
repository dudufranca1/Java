package Fundamentos;

public class A_46_OperadorTernario {
	public static void main(String[] args) {
		
		// Operador tern�rio = tr�s operandos 
		// ? = separa a express�o dos valores que v�o ser atribuidos.
		// : = separa se a express�o for true or false.
		
		double media = 7.6;
		// Atribui��o condicional = se uma express�o for true or false.		
		//String resultadoParcial = media >= 5.0 ? "em recupera��o" : "reprovado.";
		String resultadoFinal = media >= 7.0 ? "aprovado" : "reprovado";
		
		System.out.println("O aluno est� " +resultadoFinal);
	}
}
