package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print; // criando print para stream
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Python ", "PHP\n");
		langs.forEach(print);
		
		String[] maisLangs = { "MySQL ", "JS ", "GO " , "Pearl\n" };
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "C++ ", "C#\n");
		outrasLangs.stream().forEach(print);		// Aqui os dados são processados em ordem
		outrasLangs.parallelStream().forEach(print); // os dados não são processados na ordem
													// porque estão em paralelo
		// gerando stream de forma infinita
		// Stream.generate(() -> "a").forEach(print);
		 Stream.iterate(0, n -> n + 1).forEach(println);
		
	}
}
