package br.com.stefanini.relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.relacionamentos.entity.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer>{
	
	public Mobile findByCustomerId(String customerId);

}
