package br.com.stefanini.relaciona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RelacionaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelacionaApplication.class, args);
	}

}
