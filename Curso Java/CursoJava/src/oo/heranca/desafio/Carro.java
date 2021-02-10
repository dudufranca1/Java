package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual = 5;
	private int delta = 5;
	
	// Definindo segundo construtor com velocidade m�xima padr�o
	// com Protected o construtor s� ficar� vis�vel por heran�a
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
		return "Velocidade atual � " +velocidadeAtual + "Km/h.";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	

}
