package com.edureka.my_demo_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDemoProjectApplication.class, args);
	}

	@GetMapping("/")
    public String hello() {
      return String.format("<h1>Hello There!!! Welcome to my project</h1>");
    }
}
