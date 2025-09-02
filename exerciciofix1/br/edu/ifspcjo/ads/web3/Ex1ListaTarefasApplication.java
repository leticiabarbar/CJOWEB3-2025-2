package br.edu.ifspcjo.ads.web3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    "br.edu.ifspcjo.ads.web3.resources",     
    "br.edu.ifspcjo.ads.web3.domain.model",  
    "br.edu.ifspcjo.ads.web3.repository"     
})
@EnableJpaRepositories(basePackages = "br.edu.ifspcjo.ads.web3.repository")
@EntityScan(basePackages = "br.edu.ifspcjo.ads.web3.domain.model")
public class Ex1ListaTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex1ListaTarefasApplication.class, args);
	}

}
