package com.anddas.sql.jpa.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anddas.sql.jpa.model.Venda;
import com.anddas.sql.jpa.service.VendaService;

@RestController
@RequestMapping("/venda")
public class VendaController {
	

	private VendaService venda;
	
	public VendaController(VendaService venda) {
		
		this.venda = venda;
	}
	
	
	@GetMapping(value = "/listar")
	public List<Venda> listarVendas(){
		
		return venda.buscarTodasVendas();
	}
	
	@GetMapping(value = "/listar/{id}")
	public Venda buscarVendaPorID(@PathVariable("id") Integer id) {
		
		
		return venda.buscarPorId(id);
	}
	

	


	

}
