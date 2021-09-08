package br.com.stefanini.projetocache.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.projetocache.entity.Users;
import br.com.stefanini.projetocache.repository.UsersRepository;
import br.com.stefanini.projetocache.service.UsersService;

@ResponseBody
@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	UsersService service;

	@Autowired
	UsersRepository repository;

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Users user) {
		try {
			Users resp = service.saveOrUpdate(user);
			if (resp == null) {
				throw new Exception("Erro na Gravacao");
			}
			return ResponseEntity.status(200).body(resp);
		} catch (Exception ex) {
			return ResponseEntity.status(200).body("error:" + ex.getMessage());
		}
	}

	@PostMapping("/saveuser")
	public ResponseEntity<?> savepost(@RequestBody Users user) {
		try {
			Users resp = repository.save(user);
			if (resp == null) {
				throw new Exception("Erro na Gravacao");
			}
			String msg = service.enviarEmail(user);
			Map<String, Object> mapa = new HashMap<String, Object>();

			mapa.put("users", resp);
			mapa.put("email", msg);

			return ResponseEntity.status(200).body(mapa);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).body("error:" + ex.getMessage());
		}

	}

}
