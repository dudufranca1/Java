package com.estudando.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudando.exerciciossb.model.entities.Produto;
import com.estudando.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired // injetando o objeto
	private ProdutoRepository produtoRepository;
	
	//@PostMapping // essa função abaixo serve para inserir (POST) e alterar (PUT)
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto novoProduto (@Valid Produto produto) { // @Valid para aplicar as regras de Produto (NotBlank, min, max)
		produtoRepository.save(produto); // enviado automáticamente para o mysql e também o ID retornado de forma correta
		return produto;
	}
	
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping
	@RequestMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
		//return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
		return produtoRepository.searchByNameLike(parteNome);
	}
	
	// Essa é uma estratégia para garantir que não vai obter mais dados do que necessário
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}") // fazendo consulta paginada
	public Iterable<Produto> obterProdutosPorPagina(
			@PathVariable int numeroPagina, @PathVariable int qtdePagina){
		if(qtdePagina >= 5) qtdePagina = 5; // limitando a quantidade de elementos para aparecer na página
		Pageable page = PageRequest.of(numeroPagina, qtdePagina);
		return produtoRepository.findAll(page);
	}
	
	@GetMapping(path = "/{id}") // fazendo uma requisição atráves do ID
	public Optional<Produto> obterProdutoPorId(@PathVariable int id){
		return produtoRepository.findById(id);
	}
	
//	@PutMapping // alterando o produto (PUT = requisição para alterar o objeto inteiro)
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
}
