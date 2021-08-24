package br.com.stefanini.projetoRelacionamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.stefanini.projetoRelacionamento.dto.response.ResponseException;
import br.com.stefanini.projetoRelacionamento.entity.User;
import br.com.stefanini.projetoRelacionamento.repository.UserRepository;

public class UserController {
	
	@Autowired
	private UserRepository repository;

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody User user) {
		try {
			User resp = repository.save(user);

			if (resp == null) {
				throw new Exception("Usuario invalido");
			}
			return ResponseEntity.status(200).body(resp);
		} catch (Exception ex) {
			ResponseException response = new ResponseException("Erro", "Usuario Invalido");
			return ResponseEntity.status(200).body(response);
		}
		
	}
}
