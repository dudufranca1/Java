package classe;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Andre";
		u1.email = "andre.professor@estacio.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Andre";
		u2.email = "andre.professor@estacio.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}
}
