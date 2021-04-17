package com.prueba.valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ValidApplication implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(ValidApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		template.execute("CREATE TABLE IF NOT EXISTS REGISTRO(id INTEGER(10) PRIMARY KEY auto_increment, nombre VARCHAR(255), apellido VARCHAR(255), procesado INTEGER(1))");
	}

}
