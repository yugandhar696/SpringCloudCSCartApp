package com.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartRestController {
	@Value("${my.msg:hello default one}")
	private String code;
	@GetMapping("/show")
	public String show() {
		
		return "From Cart "+code;
	}
}
