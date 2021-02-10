package com.estudando.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estudando.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping ("/clientes")
public class ClienteController {
	
	@GetMapping (path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}
	
	// Passando um valor da requisição para dentro do método
	@GetMapping("/{id}")
	public Cliente obterClientePorId(@PathVariable int id) { //PathVariable = para pegar o valor passado na URL e jogar pra cá
		return new Cliente(id, "Maria", "987.654.321-00");
	}
	
	@GetMapping // path = /clientes?id=
	public Cliente obterClientePorId2(
			@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "João Augusto", "123.456.789-00");
	}
}
