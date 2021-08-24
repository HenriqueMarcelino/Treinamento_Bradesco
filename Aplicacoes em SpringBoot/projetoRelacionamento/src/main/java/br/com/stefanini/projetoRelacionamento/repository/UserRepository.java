package br.com.stefanini.projetoRelacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.projetoRelacionamento.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmail (String email);

}
