package oo.composicao;

public class Carro {	
	
	// Declarando o class Motor como atributo de instância
	Motor motor = new Motor();
	
	void acelerar() {
		// Estabelecendo críterio (mecanismos de defesa, proteção)
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		// Estabelecendo críterio (mecanismos de defesa, proteção)
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	// função para saber se o carro esta ligado a partir do motor
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
