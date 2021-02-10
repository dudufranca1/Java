package com.estudando.exerciciossb.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Marcando esta classe como controller
public class PrimeiroController {

	//@RequestMapping // Mapear uma requisição para esse método = essa URL para o RequestMapping
	@GetMapping(path = { "/ola", "/saudacao"})
	public String ola() {
		return "Olá Spring Boot!";
	}
}
