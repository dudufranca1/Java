package lambdas;

@FunctionalInterface
// /\ s� pode ter apenas um m�todo (abstrato)
// mas pode criar um m�todo default ou static
public interface Calculo {
	
	public abstract double executar (double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
	
}
