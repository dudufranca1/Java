package oo.composicao;
// Rela��o que existe entre carro e motor
// Rela��o de 1 para 1
// um carro tem um motor e um motor tem um carro
// ter uma classe dentro de outra classe como atributo
// Rela��o Unidirecional
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
