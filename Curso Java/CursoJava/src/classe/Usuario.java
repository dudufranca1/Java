package classe;

public class Usuario {
	
	String nome;
	String email;
	
	// Object vem acima de todas hierarquias de objetos no java
	public boolean equals(Object objeto) {
		
		// (Usuario) fazendo um cast, pegando objeto e convertendo em usuario
		Usuario outro = (Usuario) objeto;
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
	}
}

