package com.pandey.shrey.postgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class PostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresApplication.class, args);
	}

}
