package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Eduardo", 77.4);
		//p1.nome = "Eduardo";
		//p1.peso = 77;
		
		Comida c1 = new Comida();
		c1.nome = "Caram�o";
		c1.peso = 0.500;
		
		Comida c2 = new Comida();
		c2.nome = "Empada de frango";
		c2.peso = 0.500;
		
		System.out.println(p1.apresentar());
		p1.comer(c1);			
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
		
	}
}