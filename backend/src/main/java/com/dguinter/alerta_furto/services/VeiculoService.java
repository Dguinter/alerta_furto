package com.dguinter.alerta_furto.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dguinter.alerta_furto.dto.VeiculoDTO;
import com.dguinter.alerta_furto.entities.Veiculo;
import com.dguinter.alerta_furto.repositories.VeiculoRepository;
import com.dguinter.alerta_furto.services.exceptions.EntityNotFoundException;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repository;
	
	@Transactional(readOnly = true)
	public List<VeiculoDTO> findAll() {
		 List<Veiculo> list = repository.findAll();
		 return list.stream().map(x -> new VeiculoDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public VeiculoDTO findById(Long id) {
		Optional<Veiculo> obj = repository.findById(id);
		Veiculo entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		return new VeiculoDTO(entity);
	}
}
