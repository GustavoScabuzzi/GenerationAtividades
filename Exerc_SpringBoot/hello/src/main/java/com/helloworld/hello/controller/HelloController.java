package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/hello1")
	public String hello() {
		return "A Persistencia está fazendo eu aprender muito!";
	}
	
	@GetMapping("/hello2")
	public String hello2() {
		return "A mentalidade de crescimento e a orientaçao ao futuro me levarão longe nesta semana!";
	}
	
}
