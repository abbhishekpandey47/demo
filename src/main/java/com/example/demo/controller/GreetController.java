package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@GetMapping("/sayHello/{name}")
	private String sayHello(@PathVariable String name) {
		return "Hello " + name;
	}

}
