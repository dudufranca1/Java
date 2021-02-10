package collections;
import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		//List<Usuario> lista = new ArrayList<>();
		ArrayList<Usuario> lista = new ArrayList<>();
		
		// Posso inst�nciar o objeto e adicionar a lista das duas formas:
		
		// Aqui criou-se uma v�riavel e adicionou a lista
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		// Aqui j� criou-se o objeto e adicionou autom�ticamente na lista
		lista.add(new Usuario("Eduardo"));
		lista.add(new Usuario("Beatriz"));
		lista.add(new Usuario("Julia"));
		lista.add(new Usuario("Thiago"));
		
		// aqui eu criei um m�todo toString em Usuario que vai ser impresso junto do elemento
		// Obter um determinado elemento atrav�s do id 
		// lista.get (n�mero do �ndice) .nome para aparecer o elemento
		System.out.println(lista.get(3)); // acessar pelo �ndice
		
		// removento elemento da lista
		// lista.remove(1);
		System.out.println("Esse elemento foi removido -> " 
				 +lista.remove(1)); //ir� imprimir o elemento removido
		
		// removendo a partir de um objeto
		lista.remove(new Usuario("Thiago"));
		// System.out.println(lista.remove(new Usuario("Thiago"))); // Ir� retorna um valor boolean
		
		System.out.println("Elemento contido -> "+ lista.contains(new Usuario("Julia")));
		
		for(Usuario u : lista) {
			System.out.println(u.nome);
		}
	}
}
