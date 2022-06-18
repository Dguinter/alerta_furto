package com.dguinter.alerta_furto.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dguinter.alerta_furto.entities.Veiculo;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResource {

	@GetMapping
	public ResponseEntity<List<Veiculo>> findAll(){
		List<Veiculo> list = new ArrayList<>();
		list.add(new Veiculo(1L, "sedan"));
		list.add(new Veiculo(2L, "hatch"));
		list.add(new Veiculo(3L, "SUV"));
		list.add(new Veiculo(4L, "minivan"));
		list.add(new Veiculo(5L, "van"));
		list.add(new Veiculo(6L, "caminhonete"));
		list.add(new Veiculo(7L, "caminhão"));
		return ResponseEntity.ok().body(list);
	}
}