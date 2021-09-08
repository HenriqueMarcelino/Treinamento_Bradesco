package br.com.stefanini.progreativa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.progreativa.entity.Product;
import br.com.stefanini.progreativa.repository.ProductRepository;
import br.com.stefanini.progreativa.service.ProductService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService service;

	@Autowired
	private ProductRepository repository;

	@GetMapping("/list")
	public Flux<Product> getProducts() {
		return repository.findAll();
	}

	@PostMapping("/save")
	public Mono<Product> save(@RequestBody Product product) {
		return repository.save(product);
	}

	@GetMapping("/find/{id}")
	public Mono<ResponseEntity<Product>> getProductsByID(@PathVariable("id") String id) {
		return repository.findById(id).map(prod -> ResponseEntity.status(200).body(prod))
				.defaultIfEmpty(ResponseEntity.status(404).build());
	}

}
