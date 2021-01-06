package com.anddas.sql.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anddas.sql.jpa.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	@Query(nativeQuery = true, value = "select * from cliente where nome_cliente like ?1%")
	public List<Cliente> buscarPorNome(String nome);
		


}
