package com.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.repository.PersonRepository;

@SpringBootApplication(scanBasePackages = {"com.*"})
@EnableJpaRepositories(basePackageClasses = PersonRepository.class)
@EntityScan("com.model")
public class One1Application {

	public static void main(String[] args) {
		SpringApplication.run(One1Application.class, args);
	}

}
