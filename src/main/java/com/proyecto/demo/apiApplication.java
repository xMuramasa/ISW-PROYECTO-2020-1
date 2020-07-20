package com.proyecto.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class apiApplication {

	public static void main(String[] args) {
		System.out.println("lamao soy una app y estoy corriendo");
		SpringApplication.run(apiApplication.class, args);
	}

}
