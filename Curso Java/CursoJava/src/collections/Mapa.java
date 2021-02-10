package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		// HashMap -> método
		//  Chave    Valor
		Map<Integer, String> usuarios = new HashMap<>();
		// método put para adicionar
		// foi criado put para que se podesse adicionar e substituir caso
		// fosse o mesmo elemnto
		usuarios.put(1, "Roberto");
		// aqui está substituindo
		//usuarios.put(1, "Ricardo");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		// keySet conjunto das chaves, irá retorar todas as chaves
		System.out.println(usuarios.keySet());
		// values para pegar os valores
		System.out.println(usuarios.values());
		// entrySet para pegar chave e valores ao mesmo tempo
		System.out.println(usuarios.entrySet());
		// containsKey
		System.out.println(usuarios.containsKey(2));
		// containsValue
		System.out.println(usuarios.containsValue("Rafaela"));
		// get pegando a partir do elemento
		System.out.println(usuarios.get(3));
		// remove para remover elemtno
		System.out.println(usuarios.remove(1));
		// System.out.println(usuarios.remove(2, "Ricardo"));
		
		// Percorrer a partir das chaves
		for (int chaves : usuarios.keySet()) {
			System.out.println(chaves);
		}		
		// Percorrer a partir dos valores
		for (String valores : usuarios.values()) {
			System.out.println(valores);
		}
		// Percorrer os dois valores (Entry)
		for(Entry <Integer, String> registros : usuarios.entrySet()) {
			System.out.print(registros.getKey() + " -> ");
			System.out.println(registros.getValue());
		}
	}
}
