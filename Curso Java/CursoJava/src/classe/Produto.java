package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.29;
	// double desconto;
	
	// Com o construtor padr�o:
	// Criado ainda posso utilizar o construtor padr�o
	// N�o possui par�metros
	Produto (){
		
	}
	
	// Definindo de forma expl�cita o construtor padr�o
	// Criado o construtor padr�o deixar de existir
	Produto (String nomeInicial, double precoInicial/*, double descontoInicial*/){
		nome = nomeInicial;
		preco = precoInicial;
		//desconto = descontoInicial;
	}
	
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	
	// Crirei uma v�riavel descondoDoGerente para
	// adicionar um desconto a mais no valor do produto
	double precoComDesconto (double descondoDoGerente) {
		return preco * (1 - desconto + descondoDoGerente);
	}

}

