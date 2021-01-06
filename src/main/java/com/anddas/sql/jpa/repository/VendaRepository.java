package com.anddas.sql.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anddas.sql.jpa.model.Venda;

public interface VendaRepository  extends JpaRepository<Venda, Integer>{

	
	@Query( nativeQuery = true, value = "select * from venda where id_cliente_venda =?1")
	public List<Venda> buscarPorIdCliente(Integer id);
	

}
