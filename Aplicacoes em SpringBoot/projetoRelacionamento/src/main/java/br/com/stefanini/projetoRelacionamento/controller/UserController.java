package br.com.stefanini.projetoRelacionamento.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.projetoRelacionamento.dto.response.ResponseException;
import br.com.stefanini.projetoRelacionamento.entity.Address;
import br.com.stefanini.projetoRelacionamento.entity.Users;
import br.com.stefanini.projetoRelacionamento.repository.AddressRepository;
import br.com.stefanini.projetoRelacionamento.repository.UserRepository;

@ResponseBody
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AddressRepository addressRepository;

	@GetMapping("/findall")
	public List<Users> findAllUser() {
		return userRepository.findAll();
	}

	@GetMapping("findallid{id}")
	public ResponseEntity<?> findById(@PathParam("id") Long id) {
		try {
			Users user = userRepository.findById(id).get();

			if (user == null) {
				throw new Exception("Usuario não encontrado");
			}
			return ResponseEntity.status(200).body(user);
		} catch (Exception ex) {
			ResponseException resp = new ResponseException("status", "Usuario não encontrado");
			return ResponseEntity.status(200).body(resp);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Users user) {
		try {
			Address address = user.getAddress(); // Resgatando o relacionamento
			Users user2 = userRepository.save(user); // testando para ver se da certo, pediu para renomear.
			// User user = userRepository.save(user); // Esta gerando a chave primaria
			address.setUser(user); // Setando a chave primaria
			addressRepository.save(address); // Salvando o que esta relacionado com o usuario

			if (user == null) {
				throw new Exception("Usuario não encontrado");
			}
			return ResponseEntity.status(200).body(user);
		} catch (Exception ex) {
			ResponseException resp = new ResponseException("status", "Usuario não gravado");
			return ResponseEntity.status(200).body(resp);
		}
	}

}
