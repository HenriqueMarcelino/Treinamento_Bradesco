package br.com.stefanini.projetoManytoMany;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.stefanini.projetoManytoMany.entity.Project;
import br.com.stefanini.projetoManytoMany.entity.Users;
import br.com.stefanini.projetoManytoMany.repository.ProjectRepository;
import br.com.stefanini.projetoManytoMany.repository.UsersRepository;

@SpringBootApplication
public class ProjetoManytoManyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjetoManytoManyApplication.class, args);
	}

	@Autowired
	private UsersRepository udao;
	
	@Autowired
	private ProjectRepository pdao;
	
	@Override
	public void run(String... args) throws Exception {
		pdao.deleteAll();
		udao.deleteAll();
		
		Users users1 = new Users(11,"Henrique","henrique@gmail.com","123456");
		Users users2 = new Users(12,"Carlos","carlos@gmail.com","12345678");
		Users users3 = new Users(13,"Gabriela","gabriela@gmail.com","123456789");
		
		users1.setProjects(new HashSet<Project>());
		Project project1 = new Project(1001,"Projeto Revisão JWT");
		Project project2 = new Project(1002,"Refinamento dos Projetos em Homo1");
		
		users1.add(project1);
		users2.add(project2);
		
		udao.save(users1);
		
		System.out.println("Mysql...");
		
		
	}

}
