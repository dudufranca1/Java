package lambdas;

@FunctionalInterface
// /\ só pode ter apenas um método (abstrato)
// mas pode criar um método default ou static
public interface Calculo {
	
	public abstract double executar (double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
	
}
