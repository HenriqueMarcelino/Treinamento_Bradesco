package br.com.stefanini.relacionamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.relacionamento.entity.Cliente;
import br.com.stefanini.relacionamento.response.ErrorMessage;
import br.com.stefanini.relacionamento.service.ClienteService;

@ResponseBody
@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	ClienteService service;

	@PostMapping("/save")
	public ResponseEntity<?> create(@RequestBody Cliente cliente) {
		try {
			
			Cliente resposta = service.gravar(cliente);
			return ResponseEntity.status(200).body(resposta);

		} catch (Exception ex) {
			ErrorMessage response = new ErrorMessage("Erro na gravação", ex.getMessage());
			return ResponseEntity.status(200).body(response);

		}
	}

}
