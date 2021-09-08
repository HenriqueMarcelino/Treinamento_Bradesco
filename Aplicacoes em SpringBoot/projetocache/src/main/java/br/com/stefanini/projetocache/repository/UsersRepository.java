package br.com.stefanini.projetocache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.projetocache.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

}
