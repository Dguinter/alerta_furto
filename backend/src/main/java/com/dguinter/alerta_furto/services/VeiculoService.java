package com.dguinter.alerta_furto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dguinter.alerta_furto.entities.Veiculo;
import com.dguinter.alerta_furto.repositories.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repository;
	
	@Transactional(readOnly = true)
	public List<Veiculo> findAll() {
		return repository.findAll();
	}
}
