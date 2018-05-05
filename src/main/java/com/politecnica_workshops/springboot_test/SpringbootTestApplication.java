package com.politecnica_workshops.springboot_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.politecnica.operation;

@SpringBootApplication
public class SpringbootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTestApplication.class, args);
	}
	@Bean
	public operation buildOperation(){
		return new operation();
	}
}
