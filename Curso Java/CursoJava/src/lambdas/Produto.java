package lambdas;

// Object é a classe mãe de todas as outras classes em java.
// A partir do object tudo vai surgir em java
public class Produto extends Object{
// Aula 174 Predicate
	
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {		
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	// Para usar no method reference em Consumer
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço de R$ "  + preco + precoFinal;
	}
	
	
	
}
