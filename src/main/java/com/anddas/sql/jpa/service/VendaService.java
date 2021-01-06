package com.anddas.sql.jpa.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anddas.sql.jpa.model.Venda;
import com.anddas.sql.jpa.repository.VendaRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository repor;
	
	public List<Venda> buscarTodasVendas(){
		
		return repor.findAll();
		
	}
	
	public Venda buscarPorId(Integer id) {
		Venda v = repor.findById(id).get();
	
		return v;
	}
	
	
	public List<Venda> buscarPorIdCliente(Integer id) {
		
		return repor.buscarPorIdCliente(id);
	}
	


	
}
