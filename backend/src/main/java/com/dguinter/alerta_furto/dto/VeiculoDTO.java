package com.dguinter.alerta_furto.dto;

import java.io.Serializable;

import com.dguinter.alerta_furto.entities.Veiculo;

public class VeiculoDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	
	public VeiculoDTO( ) {
		
	}
	
	public VeiculoDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public VeiculoDTO(Veiculo entity) {
		this. id = entity.getId();
		this.name = entity.getName();
			
		}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
