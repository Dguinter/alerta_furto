package com.dguinter.alerta_furto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dguinter.alerta_furto.entities.Veiculo;
import com.dguinter.alerta_furto.repositories.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repository;
	public List<Veiculo> findAll() {
		return repository.findAll();
	}
}
