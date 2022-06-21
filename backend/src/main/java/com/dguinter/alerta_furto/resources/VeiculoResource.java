package com.dguinter.alerta_furto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dguinter.alerta_furto.dto.VeiculoDTO;
import com.dguinter.alerta_furto.services.VeiculoService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResource {
	
	@Autowired
	private VeiculoService service;

	//Busca todas as categorias
	@GetMapping
	public ResponseEntity<List<VeiculoDTO>> findAll(){
		List<VeiculoDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	//Busca categoria por ID
		@GetMapping(value = "/{id}")
		public ResponseEntity<VeiculoDTO> findById(@PathVariable Long id){
			VeiculoDTO dto = service.findById(id);
			return ResponseEntity.ok().body(dto);
		}
	}