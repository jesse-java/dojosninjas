package com.naldojesse.dojos_ninjas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;



@Controller
@SpringBootApplication
public class DojosNinjasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojosNinjasApplication.class, args);
	}


	@RequestMapping("/")
	public String index()  {
		return "index.jsp";
	}
}
