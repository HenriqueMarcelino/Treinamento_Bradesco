package br.com.stefanini.relaciona.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.stefanini.relaciona.dto.UsersTelefoneDto;
import br.com.stefanini.relaciona.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	@Query(value="select u.idusers, u.nome, u.email, t.numero "
			+ " from users u inner join telefone t"
			+ " on u.idusers = t.iduser", nativeQuery=true
			)

	public List<UsersTelefoneDto> fetchUsersTelefoneDataInnerJoin();
	
	public Users findByEmailandPassword(String email, String password);

	

	

}
