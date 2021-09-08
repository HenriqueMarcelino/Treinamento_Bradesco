package br.com.stefanini.projetoRelacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.projetoRelacionamento.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
