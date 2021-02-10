package classe;

public class AreaCircunferencia {
	
	double raio;
	// Static = estou dizendo que a v�riavel est� associada a classe e n�o a inst�ncia
	// seu valor  ainda pode ser alterado
	// static double pi = 3.14;
	final static double PI = 3.14;
	// Usando Final ela realmente se torna uma constante e n�o pode ser alterado seu valor
	
	AreaCircunferencia (double raioInicial){
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
		// return pi * raio * raio;
	}
	
	// M�todo statico
	//static double area(double raio) {
	//	return PI * Math.pow(raio, 2);
	//}
}
