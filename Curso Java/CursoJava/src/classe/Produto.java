package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.29;
	// double desconto;
	
	// Com o construtor padrão:
	// Criado ainda posso utilizar o construtor padrão
	// Não possui parâmetros
	Produto (){
		
	}
	
	// Definindo de forma explícita o construtor padrão
	// Criado o construtor padrão deixar de existir
	Produto (String nomeInicial, double precoInicial/*, double descontoInicial*/){
		nome = nomeInicial;
		preco = precoInicial;
		//desconto = descontoInicial;
	}
	
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	
	// Crirei uma váriavel descondoDoGerente para
	// adicionar um desconto a mais no valor do produto
	double precoComDesconto (double descondoDoGerente) {
		return preco * (1 - desconto + descondoDoGerente);
	}

}

