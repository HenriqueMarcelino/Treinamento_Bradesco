package br.com.stefanini.projetoManytoMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.projetoManytoMany.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

}
