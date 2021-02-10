package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual = 5;
	private int delta = 5;
	
	// Definindo segundo construtor com velocidade máxima padrão
	// com Protected o construtor só ficará visível por herança
	protected Carro (int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar () {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}
		else {
			velocidadeAtual += getDelta();
		}		
	}
	
	public void frear () {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}
		else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " +velocidadeAtual + "Km/h.";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	

}
