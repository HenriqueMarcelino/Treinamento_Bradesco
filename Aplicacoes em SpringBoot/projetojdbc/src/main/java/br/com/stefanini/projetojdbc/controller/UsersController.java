package br.com.stefanini.projetojdbc.controller;


import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.projetojdbc.entity.Users;
import br.com.stefanini.projetojdbc.repository.UsersDaoImpl;

@ResponseBody
@RestController
@RequestMapping("/api")
public class UsersController {

	@Autowired
	UsersDaoImpl dao;

	@GetMapping("/save")
	public ResponseEntity<?> save(@RequestBody Users users) {
		try {
			int resp = dao.save(users);

			if (resp == 0) {
				throw new Exception("Dados não Gravados");
			}
			return ResponseEntity.status(200).body(users);
		} catch (Exception ex) {
			return ResponseEntity.status(500).body("error: " + ex.getMessage());
		}
	}
	
	@GetMapping("/find")
			public List<Users> getUsers(){
		return dao.findAll();
	}

	@GetMapping("/findid/{id}")
	public ResponseEntity<?> getById(@PathVariable ("id") Integer code) {
		try {
			Users user = dao.findById(code);

			if (user == null) {
				throw new Exception("Não encontrado");
			}
			return ResponseEntity.status(200).body(user);
		} catch (Exception es) {
			return ResponseEntity.status(500).body("Não encontrado");
		}

	}

	public ResponseEntity<?> update(@RequestBody Users users) {
		try {
			int resp = dao.update(users);

			if (resp == 0) {
				throw new Exception("Dados não Alterados");
			}
			return ResponseEntity.status(200).body(users);
		} catch (Exception ex) {
			return ResponseEntity.status(500).body("error: " + ex.getMessage());
		}
	}

}
