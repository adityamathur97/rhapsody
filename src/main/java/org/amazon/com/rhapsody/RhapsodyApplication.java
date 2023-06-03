package org.amazon.com.rhapsody;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
@Log4j2
public class RhapsodyApplication {

	public static void main(String[] args) {
		log.info("Started spring boot application!");
		SpringApplication.run(RhapsodyApplication.class, args);
	}

}
