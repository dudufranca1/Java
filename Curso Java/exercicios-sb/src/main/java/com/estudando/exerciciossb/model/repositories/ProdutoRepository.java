package com.estudando.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

// PagingAndSortingRepository vai ajudar a fazer consultas paginadas e ordenação
import com.estudando.exerciciossb.model.entities.Produto;
										   //CrudRepository
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> { // repositório de dados, criar métodos de auto nível para abstrair dados
// Repository é responsável por fazer a persistência de um produto
	
	// Conversão de nome, conversão é pre estabelecida pelo Spring Boot
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	
	// findByNomeContaining
	// findByNomeContaining
	// findByNomeContains
	
	// findByNomeStrtsWith
	// findByNomeEndsWith
	
	// findByNomeNotContaining
	
	// Tem a possibilidade de chamar uma Query e a partir dela vai ter uma flexbilidade maior para montar uma JPQL (consulta a partir do JPA)
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%") //@Param= parâmetro da consulta que foi definido aqui na Query
	public Iterable<Produto> searchByNameLike(@Param ("nome") String nome);
}
