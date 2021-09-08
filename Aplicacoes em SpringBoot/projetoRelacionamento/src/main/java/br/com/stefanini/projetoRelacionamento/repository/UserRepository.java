package br.com.stefanini.projetoRelacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.projetoRelacionamento.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{
	
	public Users findByEmail (String email);

}
