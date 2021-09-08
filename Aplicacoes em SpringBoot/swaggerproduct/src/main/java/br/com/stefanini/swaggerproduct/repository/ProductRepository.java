package br.com.stefanini.swaggerproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.swaggerproduct.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
