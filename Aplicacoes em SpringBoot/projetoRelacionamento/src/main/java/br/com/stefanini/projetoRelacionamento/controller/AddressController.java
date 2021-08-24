package br.com.stefanini.projetoRelacionamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.projetoRelacionamento.dto.response.ResponseException;
import br.com.stefanini.projetoRelacionamento.entity.Address;
import br.com.stefanini.projetoRelacionamento.repository.AddressRepository;

@ResponseBody
@RestController
@RequestMapping("address")
public class AddressController {

	@Autowired
	private AddressRepository repository;

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Address address) {
		try {
			Address resp = repository.save(address);

			if (resp == null) {
				throw new Exception("Endereço invalido");
			}
			return ResponseEntity.status(200).body(resp);
		} catch (Exception ex) {
			ResponseException response = new ResponseException("Erro", "Endereço Invalido");
			return ResponseEntity.status(200).body(response);
		}
		
	}

}
