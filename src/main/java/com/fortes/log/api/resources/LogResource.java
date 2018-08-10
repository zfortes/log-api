package com.fortes.log.api.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogResource {
	@GetMapping("/teste")
	public String teste() {
		return "Hello mundo";
	}
}
