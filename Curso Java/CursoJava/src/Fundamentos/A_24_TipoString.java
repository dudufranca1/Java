package Fundamentos;

public class A_24_TipoString {
	public static void main(String[] args) {
		
		System.out.println("E ai galera!".charAt(2));
		
		String s = "Good night";
		//Exemplos
		System.out.println(s.concat("!!!"));
		
		System.out.println(s.startsWith("Good"));//Verdadeiro se começa com "Boa"
		
		System.out.println(s.toLowerCase().startsWith("good"));
		
		System.out.println(s.toUpperCase().endsWith("NIGHT"));		
		
		System.out.println(s.length());//tamanho da variável s;
		
		System.out.println(s.toLowerCase().equals("good night"));
		
		System.out.println(s.equalsIgnoreCase("good night"));
		
		System.out.println(s.contains("good"));
		
	}

}
