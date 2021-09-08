package br.com.stefanini.relaciona.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.relaciona.dto.UsersTelefoneDto;
import br.com.stefanini.relaciona.entity.Users;
import br.com.stefanini.relaciona.repository.UsersRepository;
import br.com.stefanini.relaciona.response.UsersError;

@RestController
@ResponseBody
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersRepository udao;

	private static final Logger logger = LogManager.getLogger(UsersController.class);

	@GetMapping("/")
	public ResponseEntity<?> getMenssage() {
		String msg = "Bem vindo ao sistema de relacionamento";
		logger.debug("Mensagem :", msg);
		Map<String, String> mapa = new HashMap<String, String>();
		mapa.put("mensagem", "Boas vindas ao projeto...");
		return ResponseEntity.status(200).body(mapa);
	}

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Users users) {
		try {
			Users usu = udao.save(users);
			if (users == null) {
				throw new Exception("Erro na gravação");
			}

			return ResponseEntity.status(200).body(usu);
		} catch (Exception ex) {

			return ResponseEntity.status(500).body("error:" + ex.getMessage());
		}
	}

	@GetMapping("/findall")
	public ResponseEntity<?> findAll() {
		List<UsersTelefoneDto> lista = udao.fetchUsersTelefoneDataInnerJoin();
		return ResponseEntity.status(200).body(lista);
	}

	@GetMapping("/find")
	public List<Users> find() {
		return udao.findAll();
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Users user) {
		try {
			Users usuario = udao.findByEmailandPassword(user.getEmail(), user.getPassword());

			if (usuario == null) {
				logger.error("Erro de login :" + user);
				throw new Exception("Error de Login");
			}

			logger.debug("Usuario logado:", usuario.getEmail());
			return ResponseEntity.status(200).body(usuario);

		} catch (Exception ex) {
			UsersError users = new UsersError("status", " nao logado");

			return ResponseEntity.status(500).body(users);
		}

	}

}
