package com.anddas.sql.jpa.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.anddas.sql.jpa.model.Cliente;
import com.anddas.sql.jpa.service.ClienteService;

@RestController
@RequestMapping(value = "/")
public class ClienteController {

	
	
	private ClienteService service;
	public ClienteController(ClienteService service) {
		this.service = service;
	}
	@GetMapping
	public List<Cliente> lista() {
		
		return service.buscarTodos();
	}
	
	@GetMapping(value = "/cliente")
	public List<Cliente> BuscarVendaPorIdCliente(@RequestParam(value = "nome", required = false) String nome) {
		return service.buscarPorNome(nome);
	}
	
	


}
