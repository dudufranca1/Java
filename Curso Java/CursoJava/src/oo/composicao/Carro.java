package oo.composicao;

public class Carro {	
	
	// Declarando o class Motor como atributo de inst�ncia
	Motor motor = new Motor();
	
	void acelerar() {
		// Estabelecendo cr�terio (mecanismos de defesa, prote��o)
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		// Estabelecendo cr�terio (mecanismos de defesa, prote��o)
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
	// fun��o para saber se o carro esta ligado a partir do motor
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
