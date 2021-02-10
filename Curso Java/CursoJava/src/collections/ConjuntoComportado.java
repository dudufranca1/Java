package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		// Dados homogêneos (todos os elementos do conjunto são do mesmo tipo)
		// <String> = to definindo que esse tipo de dado será do tipo String 
		
		// TreeSet garante a ordem de inseção (ordenação)
		Set<String> lista = new TreeSet<>();
		lista.add("Eduardo");
		lista.add("Carlos");
		lista.add("João");
		lista.add("Larissa");
		
		for(String candidatos : lista) {
			System.out.println(candidatos);
		}
		
		Set<Double> notas = new HashSet<>();
		notas.add(9.6);
		notas.add(8.4);
		notas.add(8.8);
		notas.add(9.2);
		
		double total = 0;
		for(double nota : notas) {
			total += nota;
		}
		double media = total / notas.size();
		System.out.printf("A média é: %.2f",media);
		
		
	}
}
