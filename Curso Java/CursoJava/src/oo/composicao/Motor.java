package oo.composicao;
// Relação que existe entre carro e motor
// Relação de 1 para 1
// um carro tem um motor e um motor tem um carro
// ter uma classe dentro de outra classe como atributo
// Relação Unidirecional
public class Motor {
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros() {
		if(!ligado) {
			return 0;
		}
		else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}

}
