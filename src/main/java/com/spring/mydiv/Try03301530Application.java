package com.spring.mydiv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Try03301530Application {

	public static void main(String[] args) {
		SpringApplication.run(Try03301530Application.class, args);
		System.out.print("fin");
	}
	
	@RequestMapping("/")
	public String home() {
		return "hello world spring";
	}

}
