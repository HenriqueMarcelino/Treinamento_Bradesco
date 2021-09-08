package br.com.stefanini.progreativa.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.progreativa.entity.Product;
import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository  extends ReactiveMongoRepository<Product, String>{
	
	public Flux<Product> findByNameEquals(String name);

}
