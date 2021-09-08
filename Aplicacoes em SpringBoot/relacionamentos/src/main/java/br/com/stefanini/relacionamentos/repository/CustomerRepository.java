package br.com.stefanini.relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.relacionamentos.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{

}
