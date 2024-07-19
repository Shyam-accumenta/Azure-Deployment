package com.pr.pellisambandalu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String msg() {
		return "Hello Welcome to SpringBoot";
	}
}
