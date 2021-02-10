package collections;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		// se o hashcode não for implementando vai gerar problemas
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		System.out.println();
	}
}
