package classe;

public class AreaCircunferencia {
	
	double raio;
	// Static = estou dizendo que a váriavel está associada a classe e não a instância
	// seu valor  ainda pode ser alterado
	// static double pi = 3.14;
	final static double PI = 3.14;
	// Usando Final ela realmente se torna uma constante e não pode ser alterado seu valor
	
	AreaCircunferencia (double raioInicial){
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
		// return pi * raio * raio;
	}
	
	// Método statico
	//static double area(double raio) {
	//	return PI * Math.pow(raio, 2);
	//}
}
