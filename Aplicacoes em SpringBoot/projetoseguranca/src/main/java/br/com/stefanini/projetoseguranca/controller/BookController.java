package br.com.stefanini.projetoseguranca.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.projetoseguranca.entity.Book;
import br.com.stefanini.projetoseguranca.repository.BookRepository;

@RestController
@ResponseBody
@Valid
@RequestMapping("/api")
public class BookController {

	@Autowired
	public BookRepository bookRepository;

	@PostMapping("/books")
	public ResponseEntity<?> create(Book book) {
		try {
			Book resp = bookRepository.save(book);

			if (resp == null) {
				throw new Exception("Livro Invalido");
			}
			return ResponseEntity.status(200).body(resp);

		} catch (Exception ex) {
			return ResponseEntity.status(500).body("Error: " + ex.getMessage());
		}
	}

	@GetMapping("/books")
	public ResponseEntity<?> findAll() {
		try {
			List<Book> books = bookRepository.findAll();

			return ResponseEntity.status(200).body(books);

		} catch (Exception ex) {
			return ResponseEntity.status(500).body("Error: " + ex.getMessage());
		}

	}

	@GetMapping("/books/{id}")
	public ResponseEntity<?> findId(@PathParam("id") Long id) {
		try {
			Book books = bookRepository.findById(id).get();

			return ResponseEntity.status(200).body(books);

		} catch (Exception ex) {
			return ResponseEntity.status(500).body("Error: " + ex.getMessage());
		}

	}
	
	@PutMapping("/books/{id}")
	public ResponseEntity<?> updateBook(@PathParam("id") Long id,
			@RequestBody Book book
			){
		try {
		Book resp = bookRepository.findById(id).get();
			
			if(resp ==null) {
				throw new Exception("Não Encontrad");
			}
			resp.setAuthor(book.getAuthor());
			resp.setName(book.getName());
			resp.setPrice(book.getPrice());
			
			resp = bookRepository.save(book);
			return ResponseEntity.status(200).body(resp);

		} catch (Exception ex) {
			Map<String,String> mapa = new HashMap<String, String>();
			mapa.put("status", "-1");
			mapa.put("error", "erro encontrado ...");
			return ResponseEntity.status(500).body("Error: " + ex.getMessage());
		}

	}
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<?> DeleteById(@PathVariable("id") Long id) {
		try {
			
			Book resp = bookRepository.findById(id).get();
			bookRepository.delete(resp);
			Map<String, String> mapa = new HashMap<String, String>();
			mapa.put("status", "excluido com sucesso");
			return ResponseEntity.status(200).body(mapa);

		} catch (Exception ex) {
			return ResponseEntity.status(500).body("Error: " + ex.getMessage());
		}

	}


}
