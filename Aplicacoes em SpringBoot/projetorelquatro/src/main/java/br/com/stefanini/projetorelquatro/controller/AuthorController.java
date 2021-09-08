package br.com.stefanini.projetorelquatro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.projetorelquatro.entity.Author;
import br.com.stefanini.projetorelquatro.repository.AuthorRepository;
import br.com.stefanini.projetorelquatro.response.ErrorMessage;
import br.com.stefanini.projetorelquatro.service.AuthorService;

@ResponseBody
@RestController
@RequestMapping("/authors")
public class AuthorController {

	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private AuthorService authorService;
	
	
	@PostMapping("/save")
	private ResponseEntity<?> save(@RequestBody Author author) {
		try {
			Author resposta = (Author) authorService.createAuthor(author);
			return ResponseEntity.status(200).body(resposta);

		} catch (Exception ex) {
			ErrorMessage error = new ErrorMessage("Erro na Gravação", ex.getMessage());

			return ResponseEntity.status(200).body(error);
		}

	}
	
	
	@PutMapping("/update/{id}")
	private ResponseEntity<?> update(@PathVariable ("id") Long id, @RequestBody Author author) {
		try {
			
			Author resposta = (Author) authorRepository.findById(id).get();
			if (resposta == null) {
				throw new Exception("Author não encontrado");
			}
			
			resposta.setName(author.getName());
			resposta.setEmail(author.getEmail());
			
			Author resp = authorRepository.save(resposta);
			
			return ResponseEntity.status(200).body(resposta);

		} catch (Exception ex) {
			ErrorMessage error = new ErrorMessage("Erro na Gravação", ex.getMessage());

			return ResponseEntity.status(200).body(error);
		}
	}

	@GetMapping("/findall")
	public List<Author> findAll() {
		return authorRepository.findAll();
	}

}
