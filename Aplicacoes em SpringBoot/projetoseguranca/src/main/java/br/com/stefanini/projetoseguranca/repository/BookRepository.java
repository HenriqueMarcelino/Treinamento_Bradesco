package br.com.stefanini.projetoseguranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.projetoseguranca.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
