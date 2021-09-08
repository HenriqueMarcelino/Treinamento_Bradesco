package br.com.stefanini.alteracao.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.alteracao.dto.ConsumidorRequestDto;
import br.com.stefanini.alteracao.entity.Consumidor;
import br.com.stefanini.alteracao.repository.ConsumidorRepository;

@ResponseBody
@RestController
@RequestMapping("api")
public class ConsumidorController {

	@Autowired
	private ConsumidorRepository repository;

	@GetMapping("/consumidor")
	public List<Consumidor> listagem() {
		return repository.findAll();
	}

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody @Valid ConsumidorRequestDto 
			request) {
		try {
			Consumidor resp = request.transferConsumido();
			if (resp == null) {
				throw new Exception("Dados Invalidos");
			}
			return ResponseEntity.status(200).body(repository.save(resp));
		} catch (Exception ex) {
			return ResponseEntity.status(500).body("Error :" + ex.getMessage());
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable("id") Integer id, 
			@RequestBody Consumidor consumidor) {
		try {
			Consumidor resposta = repository.findById(id).map(c -> {
				c.setNome(consumidor.getNome());
				c.setEmail(consumidor.getEmail());
				c.setStatus("alterado");
				return repository.save(c);
			}).get();
			if (resposta == null) {
				throw new Exception("Não encontrado");
			}
			return ResponseEntity.status(200).body(repository.save(resposta));
		} catch (Exception ex) {
			return ResponseEntity.status(500).body("Error :" + ex.getMessage());
		}
	}

	@PatchMapping("/update/nome/{id}")
	public ResponseEntity<?> updateNome(@PathVariable("id") Integer id, 
			@RequestBody Consumidor consumidor) {
		try {
			Consumidor resposta = repository.findById(id).map(c -> {
				c.setNome(consumidor.getNome());
				return repository.save(c);
			}).get();
			if (resposta == null) {
				throw new Exception("Não encontrado");
			}
			return ResponseEntity.status(200).body(repository.save(resposta));
		} catch (Exception ex) {
			return ResponseEntity.status(500).body("Error :" + ex.getMessage());
		}
	}

}
