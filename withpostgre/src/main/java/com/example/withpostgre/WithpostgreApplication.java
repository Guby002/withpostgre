package com.example.withpostgre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

@EnableJpaRepositories("com.example.withpostgre.responsitory")
@EntityScan("com.example.withpostgre.model")
@SpringBootApplication
public class WithpostgreApplication {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(WithpostgreApplication.class, args);
	}

}
