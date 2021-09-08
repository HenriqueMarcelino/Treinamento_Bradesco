package br.com.stefanini.alteracao.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.stefanini.alteracao.entity.Consumidor;

@Repository
public interface ConsumidorRepository extends JpaRepository<Consumidor,Integer>{
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="update Consumidor c SET c.nome =:nome, c.email=:email, c.status=:status where c.id=:id")
	public int updateNameEmailStatus(@Param("nome") String nome, 
									 @Param("email") String email,
									 @Param("status") String status,
									 @Param("id") int id
									 );

}
