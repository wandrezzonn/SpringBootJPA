package com.anddas.sql.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Integer id;

	@Column(name = "nome_cliente")
	private String nome;

	@Column(name = "cpf_cliente")
	private String cpf;

	
	@OneToOne
	@JoinColumn(name="tipo_cliente")
	private TipoCliente tipo_cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public TipoCliente getTipo_cliente() {
		return tipo_cliente;
	}

	public void setTipo_cliente(TipoCliente tipo_cliente) {
		this.tipo_cliente = tipo_cliente;
	}

}
