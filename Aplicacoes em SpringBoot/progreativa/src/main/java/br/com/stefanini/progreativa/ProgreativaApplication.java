package br.com.stefanini.progreativa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

//Habilitando o mongodb @EnableReactiveMongoRepositories

@SpringBootApplication
@EnableReactiveMongoRepositories
public class ProgreativaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgreativaApplication.class, args);
	}

}
