package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	
	public static void main(String []args) {
		
		Carro civic = new Civic();		
		Ferrari ferrari = new Ferrari();		
		
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.desligarAr();
		
		ferrari.acelerar();	
		ferrari.acelerar();
		
		System.out.println(ferrari);
		System.out.println(ferrari.velocidadeDoAr());
		
		civic.acelerar();
		civic.acelerar();		
		
		System.out.println(civic);
		
		ferrari.frear();
		civic.frear();
				
		System.out.println(ferrari);
		System.out.println(civic);
		
	}

}
