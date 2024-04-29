package com.example.day14ce1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info =@Info(
				title = "Employee",
				version = "1.1.2",
				description = "swagger sample code",
				contact = @Contact(
						name = "HARISH S",
						email = "727722EUCS066@SKCET.AC.IN"
						)
				)
		)


@SpringBootApplication
public class HarishDay14ce1Application {

	public static void main(String[] args) {
		SpringApplication.run(HarishDay14ce1Application.class, args);
	}

}
