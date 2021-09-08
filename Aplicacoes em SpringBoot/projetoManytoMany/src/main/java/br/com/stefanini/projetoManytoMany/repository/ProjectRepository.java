package br.com.stefanini.projetoManytoMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.projetoManytoMany.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

}
