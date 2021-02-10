package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	// final list, não se pode instânciar outra lista lista
	// não se pode criar um outro objeto apontando para outro local memória
	// não se pode alterar a referência da constante, mas pode alterar os elementos
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
	
	// Método para converter objeto em string
	public String toString() {
		return nome;
	}
}
