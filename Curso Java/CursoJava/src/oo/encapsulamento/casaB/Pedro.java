package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testeAcessos() {
		// segredo
		// facoDentroDeCasa
		// formaDeFalar
		// todosSabem
		
		// System.out.println(segredo);
		// System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		
		// Atributo Protected
		// � possivel receber atributos por heran�a sem
		// precisar criar uma inst�ncia do tipo ana
		// Ana mae = new Ana();
	}
	
}
