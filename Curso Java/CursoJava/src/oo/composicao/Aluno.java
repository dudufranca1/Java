package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	// final list, n�o se pode inst�nciar outra lista lista
	// n�o se pode criar um outro objeto apontando para outro local mem�ria
	// n�o se pode alterar a refer�ncia da constante, mas pode alterar os elementos
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;		
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	// procurar curso a partir de um nome
	// um curso que pertence a um determinado aluno
	Curso obterCursoPorNome(String nome) {
		
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}
	
	// M�todo para converter objeto em string
	public String toString() {
		return nome;
	}
}
