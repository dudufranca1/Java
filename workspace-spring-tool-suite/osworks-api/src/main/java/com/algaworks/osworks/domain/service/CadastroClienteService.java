package com.algaworks.osworks.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.osworks.domain.exception.NegocioException;
import com.algaworks.osworks.domain.model.Cliente;
import com.algaworks.osworks.domain.repository.ClienteRepository;

@Service
// Processo de negócio e alteração no banco de dados tem que passar por um service
// Indicando que essa class é um serviço
// Essa class tem como responsabilidade as regras de negócio de cadastro de Cliente
// ex: salvar, atualizar, excluir
public class CadastroClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente cliente) {
		// método para não permitir cadastrar com 2 emails iguais
		Cliente clienteExistente = clienteRepository.findByEmail(cliente.getEmail());
		
		if(clienteExistente != null && !clienteExistente.equals(cliente)) {
			throw new NegocioException("Já existe um cliente cadastrado com este e-mail.");
		}
		
		return clienteRepository.save(cliente);	
	}
	
	public void excluir(Long clienteId) {
		clienteRepository.deleteById(clienteId);
	}
}
