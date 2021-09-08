package br.com.stefanini.twodatabases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.twodatabases.database.UsersEventDao;
import br.com.stefanini.twodatabases.entity.Users;
import br.com.stefanini.twodatabases.repository.UsersRepository;

@ResponseBody
@RestController
@RequestMapping("/api")
public class UsersController {
	
	@Autowired
	UsersRepository repository;
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Users users){
		try {
			
			return ResponseEntity.status(200).body(new UsersEventDao().findAll());
			
		}catch(Exception ex) {
			return ResponseEntity.status(500).body("Erro ao gravar:" + ex.getMessage());
		}
	}

}



//Users resp = repository.save(users);
//if(resp==null) {
//	throw new Exception("Não Consegui");
//}
//
//UsersEvent event = new UsersEvent(String.valueOf(resp.getId()),
//		"save","ok", resp.toString());
//
//new UsersEventDao().save(event);

