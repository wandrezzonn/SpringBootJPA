package com.anddas.sql.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anddas.sql.jpa.model.Cliente;
import com.anddas.sql.jpa.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	
	public List<Cliente> buscarTodos(){
		
	return	repository.findAll();
	
	}
	
	public List<Cliente> buscarPorNome(String nome){
		return repository.buscarPorNome(nome);
	}
	
}
