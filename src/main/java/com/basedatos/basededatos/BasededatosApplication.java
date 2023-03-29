package com.basedatos.basededatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
@ComponentScan(basePackages = {"com.basedatos.basededatos.dao.UserDao"})
@ComponentScan(basePackages = {"com.basedatos.basededatos.controllers.UserController"})

public class BasededatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasededatosApplication.class, args);
	}

}
